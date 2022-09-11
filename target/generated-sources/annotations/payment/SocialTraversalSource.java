package payment;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import org.apache.tinkerpop.gremlin.process.computer.Computer;
import org.apache.tinkerpop.gremlin.process.computer.GraphComputer;
import org.apache.tinkerpop.gremlin.process.remote.RemoteConnection;
import org.apache.tinkerpop.gremlin.process.traversal.Traversal;
import org.apache.tinkerpop.gremlin.process.traversal.TraversalStrategies;
import org.apache.tinkerpop.gremlin.process.traversal.TraversalStrategy;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal;
import org.apache.tinkerpop.gremlin.process.traversal.step.map.AddEdgeStartStep;
import org.apache.tinkerpop.gremlin.process.traversal.step.map.AddVertexStartStep;
import org.apache.tinkerpop.gremlin.process.traversal.step.map.GraphStep;
import org.apache.tinkerpop.gremlin.process.traversal.step.sideEffect.InjectStep;
import org.apache.tinkerpop.gremlin.structure.Edge;
import org.apache.tinkerpop.gremlin.structure.Graph;
import org.apache.tinkerpop.gremlin.structure.Vertex;

public class SocialTraversalSource extends SocialTraversalSourceDsl {
  public SocialTraversalSource(Graph graph) {
    super(graph);
  }

  public SocialTraversalSource(Graph graph, TraversalStrategies strategies) {
    super(graph, strategies);
  }

  public SocialTraversalSource(RemoteConnection connection) {
    super(connection);
  }

  @Override
  public SocialTraversalSource clone() {
    return (SocialTraversalSource) super.clone();
  }

  @Override
  public SocialTraversalSource with(final String key) {
    return (SocialTraversalSource) super.with(key);
  }

  @Override
  public SocialTraversalSource with(final String key, final Object value) {
    return (SocialTraversalSource) super.with(key,value);
  }

  @Override
  public SocialTraversalSource withStrategies(final TraversalStrategy... traversalStrategies) {
    return (SocialTraversalSource) super.withStrategies(traversalStrategies);
  }

  @Override
  public SocialTraversalSource withoutStrategies(
      final Class<? extends TraversalStrategy>... traversalStrategyClasses) {
    return (SocialTraversalSource) super.withoutStrategies(traversalStrategyClasses);
  }

  @Override
  public SocialTraversalSource withComputer(final Computer computer) {
    return (SocialTraversalSource) super.withComputer(computer);
  }

  @Override
  public SocialTraversalSource withComputer(
      final Class<? extends GraphComputer> graphComputerClass) {
    return (SocialTraversalSource) super.withComputer(graphComputerClass);
  }

  @Override
  public SocialTraversalSource withComputer() {
    return (SocialTraversalSource) super.withComputer();
  }

  @Override
  public <A> SocialTraversalSource withSideEffect(final String key, final Supplier<A> initialValue,
      final BinaryOperator<A> reducer) {
    return (SocialTraversalSource) super.withSideEffect(key,initialValue,reducer);
  }

  @Override
  public <A> SocialTraversalSource withSideEffect(final String key, final A initialValue,
      final BinaryOperator<A> reducer) {
    return (SocialTraversalSource) super.withSideEffect(key,initialValue,reducer);
  }

  @Override
  public <A> SocialTraversalSource withSideEffect(final String key, final A initialValue) {
    return (SocialTraversalSource) super.withSideEffect(key,initialValue);
  }

  @Override
  public <A> SocialTraversalSource withSideEffect(final String key,
      final Supplier<A> initialValue) {
    return (SocialTraversalSource) super.withSideEffect(key,initialValue);
  }

  @Override
  public <A> SocialTraversalSource withSack(final Supplier<A> initialValue,
      final UnaryOperator<A> splitOperator, final BinaryOperator<A> mergeOperator) {
    return (SocialTraversalSource) super.withSack(initialValue,splitOperator,mergeOperator);
  }

  @Override
  public <A> SocialTraversalSource withSack(final A initialValue,
      final UnaryOperator<A> splitOperator, final BinaryOperator<A> mergeOperator) {
    return (SocialTraversalSource) super.withSack(initialValue,splitOperator,mergeOperator);
  }

  @Override
  public <A> SocialTraversalSource withSack(final A initialValue) {
    return (SocialTraversalSource) super.withSack(initialValue);
  }

  @Override
  public <A> SocialTraversalSource withSack(final Supplier<A> initialValue) {
    return (SocialTraversalSource) super.withSack(initialValue);
  }

  @Override
  public <A> SocialTraversalSource withSack(final Supplier<A> initialValue,
      final UnaryOperator<A> splitOperator) {
    return (SocialTraversalSource) super.withSack(initialValue,splitOperator);
  }

  @Override
  public <A> SocialTraversalSource withSack(final A initialValue,
      final UnaryOperator<A> splitOperator) {
    return (SocialTraversalSource) super.withSack(initialValue,splitOperator);
  }

  @Override
  public <A> SocialTraversalSource withSack(final Supplier<A> initialValue,
      final BinaryOperator<A> mergeOperator) {
    return (SocialTraversalSource) super.withSack(initialValue,mergeOperator);
  }

  @Override
  public <A> SocialTraversalSource withSack(final A initialValue,
      final BinaryOperator<A> mergeOperator) {
    return (SocialTraversalSource) super.withSack(initialValue,mergeOperator);
  }

  @Override
  public SocialTraversalSource withBulk(final boolean useBulk) {
    return (SocialTraversalSource) super.withBulk(useBulk);
  }

  @Override
  public SocialTraversalSource withPath() {
    return (SocialTraversalSource) super.withPath();
  }

  @Override
  public SocialTraversal<Vertex, Vertex> persons(String... names) {
    SocialTraversalSource clone = this.clone();
    return new DefaultSocialTraversal (clone, super.persons(names).asAdmin());
  }

  @Override
  public SocialTraversal<Vertex, Vertex> addV() {
    SocialTraversalSource clone = this.clone();
    clone.getBytecode().addStep(GraphTraversal.Symbols.addV);
    DefaultSocialTraversal traversal = new DefaultSocialTraversal(clone);
    return (SocialTraversal) traversal.asAdmin().addStep(new AddVertexStartStep(traversal, (String) null));
  }

  @Override
  public SocialTraversal<Vertex, Vertex> addV(String label) {
    SocialTraversalSource clone = this.clone();
    clone.getBytecode().addStep(GraphTraversal.Symbols.addV, label);
    DefaultSocialTraversal traversal = new DefaultSocialTraversal(clone);
    return (SocialTraversal) traversal.asAdmin().addStep(new AddVertexStartStep(traversal, label));
  }

  @Override
  public SocialTraversal<Vertex, Vertex> addV(Traversal vertexLabelTraversal) {
    SocialTraversalSource clone = this.clone();
    clone.getBytecode().addStep(GraphTraversal.Symbols.addV, vertexLabelTraversal);
    DefaultSocialTraversal traversal = new DefaultSocialTraversal(clone);
    return (SocialTraversal) traversal.asAdmin().addStep(new AddVertexStartStep(traversal, vertexLabelTraversal));
  }

  @Override
  public SocialTraversal<Edge, Edge> addE(String label) {
    SocialTraversalSource clone = this.clone();
    clone.getBytecode().addStep(GraphTraversal.Symbols.addE, label);
    DefaultSocialTraversal traversal = new DefaultSocialTraversal(clone);
    return (SocialTraversal) traversal.asAdmin().addStep(new AddEdgeStartStep(traversal, label));
  }

  @Override
  public SocialTraversal<Edge, Edge> addE(Traversal edgeLabelTraversal) {
    SocialTraversalSource clone = this.clone();
    clone.getBytecode().addStep(GraphTraversal.Symbols.addE, edgeLabelTraversal);
    DefaultSocialTraversal traversal = new DefaultSocialTraversal(clone);
    return (SocialTraversal) traversal.asAdmin().addStep(new AddEdgeStartStep(traversal, edgeLabelTraversal));
  }

  @Override
  public SocialTraversal<Vertex, Vertex> V(Object... vertexIds) {
    SocialTraversalSource clone = this.clone();
    clone.getBytecode().addStep(GraphTraversal.Symbols.V, vertexIds);
    DefaultSocialTraversal traversal = new DefaultSocialTraversal(clone);
    return (SocialTraversal) traversal.asAdmin().addStep(new GraphStep(traversal, Vertex.class, true, vertexIds));
  }

  @Override
  public SocialTraversal<Edge, Edge> E(Object... edgeIds) {
    SocialTraversalSource clone = this.clone();
    clone.getBytecode().addStep(GraphTraversal.Symbols.E, edgeIds);
    DefaultSocialTraversal traversal = new DefaultSocialTraversal(clone);
    return (SocialTraversal) traversal.asAdmin().addStep(new GraphStep(traversal, Edge.class, true, edgeIds));
  }

  @Override
  public <S> SocialTraversal<S, S> inject(S... starts) {
    SocialTraversalSource clone = this.clone();
    clone.getBytecode().addStep(GraphTraversal.Symbols.inject, starts);
    DefaultSocialTraversal traversal = new DefaultSocialTraversal(clone);
    return (SocialTraversal) traversal.asAdmin().addStep(new InjectStep(traversal, starts));
  }

  @Override
  public Optional<Class<?>> getAnonymousTraversalClass() {
    return Optional.of(__.class);
  }
}
