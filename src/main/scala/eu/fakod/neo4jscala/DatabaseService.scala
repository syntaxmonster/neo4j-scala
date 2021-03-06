package eu.fakod.neo4jscala

import org.neo4j.graphdb.GraphDatabaseService

/**
 * Interface for GraphDatabaseService
 * @author Christopher Schmidt
 *
 */
trait DatabaseService {
  def gds: GraphDatabaseService
}

/**
 * standard DatabaseService implementation
 * for GraphDatabaseService
 */
case class DatabaseServiceImpl(gds: GraphDatabaseService) extends DatabaseService

