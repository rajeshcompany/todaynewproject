package payment;

import java.lang.Override;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal;
import org.apache.tinkerpop.gremlin.process.traversal.util.DefaultTraversal;
import org.apache.tinkerpop.gremlin.structure.Graph;

public class DefaultSocialTraversal<S, E> extends DefaultTraversal<S, E> implements SocialTraversal<S, E> {
  public DefaultSocialTraversal() {
    super();
  }

  public DefaultSocialTraversal(Graph graph) {
    super(graph);
  }

  public DefaultSocialTraversal(SocialTraversalSource traversalSource) {
    super(traversalSource);
  }

  public DefaultSocialTraversal(SocialTraversalSource traversalSource,
      GraphTraversal.Admin traversal) {
    super(traversalSource, traversal.asAdmin());
  }

  @Override
  public SocialTraversal<S, E> iterate() {
    return (SocialTraversal) super.iterate();
  }

  @Override
  public GraphTraversal.Admin<S, E> asAdmin() {
    return (GraphTraversal.Admin) super.asAdmin();
  }

  @Override
  public DefaultSocialTraversal<S, E> clone() {
    return (DefaultSocialTraversal) super.clone();
  }
}
