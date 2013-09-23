package at.ait.dme.forcelayout

/**
 * A node in the force layout simulation. The node has an immutable component, representing the actual 
 * graph node, and a mutable 'state' field, containing the force simulation state. 
 * @author Rainer Simon <rainer.simon@ait.ac.at>
 */
case class Node private[forcelayout] (id: String, label: String, mass: Double = 1.0, group: Int = 0, inlinks: Seq[Edge] = Seq(), outlinks: Seq[Edge] = Seq(), state: NodeState = NodeState()) {
  lazy val links = inlinks ++ outlinks
}

/**
 * A container for the (mutable) force simulation state of a graph node.
 * @author Rainer Simon <rainer.simon@ait.ac.at>
 */
case class NodeState(var pos: Vector2D = Vector2D.random(1.0), var velocity: Vector2D = Vector2D(0, 0), var force: Vector2D = Vector2D(0, 0))  
