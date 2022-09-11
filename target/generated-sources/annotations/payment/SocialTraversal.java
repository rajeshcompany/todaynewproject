package payment;

import java.lang.Comparable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Number;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.apache.tinkerpop.gremlin.process.computer.VertexProgram;
import org.apache.tinkerpop.gremlin.process.traversal.Order;
import org.apache.tinkerpop.gremlin.process.traversal.P;
import org.apache.tinkerpop.gremlin.process.traversal.Path;
import org.apache.tinkerpop.gremlin.process.traversal.Pop;
import org.apache.tinkerpop.gremlin.process.traversal.Scope;
import org.apache.tinkerpop.gremlin.process.traversal.Traversal;
import org.apache.tinkerpop.gremlin.process.traversal.Traverser;
import org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree;
import org.apache.tinkerpop.gremlin.process.traversal.traverser.util.TraverserSet;
import org.apache.tinkerpop.gremlin.process.traversal.util.TraversalMetrics;
import org.apache.tinkerpop.gremlin.structure.Column;
import org.apache.tinkerpop.gremlin.structure.Direction;
import org.apache.tinkerpop.gremlin.structure.Edge;
import org.apache.tinkerpop.gremlin.structure.Element;
import org.apache.tinkerpop.gremlin.structure.Property;
import org.apache.tinkerpop.gremlin.structure.T;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.apache.tinkerpop.gremlin.structure.VertexProperty;

public interface SocialTraversal<S, E> extends SocialTraversalDsl<S, E> {
  @Override
  default SocialTraversal<S, Vertex> knows(String personName) {
    return (SocialTraversal) SocialTraversalDsl.super.knows(personName);
  }

  @Override
  default <E2 extends Number> SocialTraversal<S, E2> youngestFriendsAge() {
    return (SocialTraversal) SocialTraversalDsl.super.youngestFriendsAge();
  }

  @Override
  default SocialTraversal<S, Long> createdAtLeast(int number) {
    return (SocialTraversal) SocialTraversalDsl.super.createdAtLeast(number);
  }

  @Override
  default SocialTraversal<S, E> person() {
    return (SocialTraversal) SocialTraversalDsl.super.person();
  }

  @Override
  default <E2> SocialTraversal<S, E2> map(final Function<Traverser<E>, E2> function) {
    return (SocialTraversal) SocialTraversalDsl.super.map(function);
  }

  @Override
  default <E2> SocialTraversal<S, E2> map(final Traversal<?, E2> mapTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.map(mapTraversal);
  }

  @Override
  default <E2> SocialTraversal<S, E2> flatMap(final Function<Traverser<E>, Iterator<E2>> function) {
    return (SocialTraversal) SocialTraversalDsl.super.flatMap(function);
  }

  @Override
  default <E2> SocialTraversal<S, E2> flatMap(final Traversal<?, E2> flatMapTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.flatMap(flatMapTraversal);
  }

  @Override
  default SocialTraversal<S, Object> id() {
    return (SocialTraversal) SocialTraversalDsl.super.id();
  }

  @Override
  default SocialTraversal<S, String> label() {
    return (SocialTraversal) SocialTraversalDsl.super.label();
  }

  @Override
  default SocialTraversal<S, E> identity() {
    return (SocialTraversal) SocialTraversalDsl.super.identity();
  }

  @Override
  default <E2> SocialTraversal<S, E2> constant(final E2 e) {
    return (SocialTraversal) SocialTraversalDsl.super.constant(e);
  }

  @Override
  default SocialTraversal<S, Vertex> V(final Object... vertexIdsOrElements) {
    return (SocialTraversal) SocialTraversalDsl.super.V(vertexIdsOrElements);
  }

  @Override
  default SocialTraversal<S, Vertex> to(final Direction direction, final String... edgeLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.to(direction,edgeLabels);
  }

  @Override
  default SocialTraversal<S, Vertex> out(final String... edgeLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.out(edgeLabels);
  }

  @Override
  default SocialTraversal<S, Vertex> in(final String... edgeLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.in(edgeLabels);
  }

  @Override
  default SocialTraversal<S, Vertex> both(final String... edgeLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.both(edgeLabels);
  }

  @Override
  default SocialTraversal<S, Edge> toE(final Direction direction, final String... edgeLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.toE(direction,edgeLabels);
  }

  @Override
  default SocialTraversal<S, Edge> outE(final String... edgeLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.outE(edgeLabels);
  }

  @Override
  default SocialTraversal<S, Edge> inE(final String... edgeLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.inE(edgeLabels);
  }

  @Override
  default SocialTraversal<S, Edge> bothE(final String... edgeLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.bothE(edgeLabels);
  }

  @Override
  default SocialTraversal<S, Vertex> toV(final Direction direction) {
    return (SocialTraversal) SocialTraversalDsl.super.toV(direction);
  }

  @Override
  default SocialTraversal<S, Vertex> inV() {
    return (SocialTraversal) SocialTraversalDsl.super.inV();
  }

  @Override
  default SocialTraversal<S, Vertex> outV() {
    return (SocialTraversal) SocialTraversalDsl.super.outV();
  }

  @Override
  default SocialTraversal<S, Vertex> bothV() {
    return (SocialTraversal) SocialTraversalDsl.super.bothV();
  }

  @Override
  default SocialTraversal<S, Vertex> otherV() {
    return (SocialTraversal) SocialTraversalDsl.super.otherV();
  }

  @Override
  default SocialTraversal<S, E> order() {
    return (SocialTraversal) SocialTraversalDsl.super.order();
  }

  @Override
  default SocialTraversal<S, E> order(final Scope scope) {
    return (SocialTraversal) SocialTraversalDsl.super.order(scope);
  }

  @Override
  default <E2> SocialTraversal<S, ? extends Property<E2>> properties(final String... propertyKeys) {
    return (SocialTraversal) SocialTraversalDsl.super.properties(propertyKeys);
  }

  @Override
  default <E2> SocialTraversal<S, E2> values(final String... propertyKeys) {
    return (SocialTraversal) SocialTraversalDsl.super.values(propertyKeys);
  }

  @Override
  default <E2> SocialTraversal<S, Map<String, E2>> propertyMap(final String... propertyKeys) {
    return (SocialTraversal) SocialTraversalDsl.super.propertyMap(propertyKeys);
  }

  @Override
  default <E2> SocialTraversal<S, Map<Object, E2>> elementMap(final String... propertyKeys) {
    return (SocialTraversal) SocialTraversalDsl.super.elementMap(propertyKeys);
  }

  @Override
  default <E2> SocialTraversal<S, Map<Object, E2>> valueMap(final String... propertyKeys) {
    return (SocialTraversal) SocialTraversalDsl.super.valueMap(propertyKeys);
  }

  @Override
  default <E2> SocialTraversal<S, Map<Object, E2>> valueMap(final boolean includeTokens,
      final String... propertyKeys) {
    return (SocialTraversal) SocialTraversalDsl.super.valueMap(includeTokens,propertyKeys);
  }

  @Override
  default SocialTraversal<S, String> key() {
    return (SocialTraversal) SocialTraversalDsl.super.key();
  }

  @Override
  default <E2> SocialTraversal<S, E2> value() {
    return (SocialTraversal) SocialTraversalDsl.super.value();
  }

  @Override
  default SocialTraversal<S, Path> path() {
    return (SocialTraversal) SocialTraversalDsl.super.path();
  }

  @Override
  default <E2> SocialTraversal<S, Map<String, E2>> match(final Traversal<?, ?>... matchTraversals) {
    return (SocialTraversal) SocialTraversalDsl.super.match(matchTraversals);
  }

  @Override
  default <E2> SocialTraversal<S, E2> sack() {
    return (SocialTraversal) SocialTraversalDsl.super.sack();
  }

  @Override
  default SocialTraversal<S, Integer> loops() {
    return (SocialTraversal) SocialTraversalDsl.super.loops();
  }

  @Override
  default SocialTraversal<S, Integer> loops(final String loopName) {
    return (SocialTraversal) SocialTraversalDsl.super.loops(loopName);
  }

  @Override
  default <E2> SocialTraversal<S, Map<String, E2>> project(final String projectKey,
      final String... otherProjectKeys) {
    return (SocialTraversal) SocialTraversalDsl.super.project(projectKey,otherProjectKeys);
  }

  @Override
  default <E2> SocialTraversal<S, Map<String, E2>> select(final Pop pop, final String selectKey1,
      final String selectKey2, String... otherSelectKeys) {
    return (SocialTraversal) SocialTraversalDsl.super.select(pop,selectKey1,selectKey2,otherSelectKeys);
  }

  @Override
  default <E2> SocialTraversal<S, Map<String, E2>> select(final String selectKey1,
      final String selectKey2, String... otherSelectKeys) {
    return (SocialTraversal) SocialTraversalDsl.super.select(selectKey1,selectKey2,otherSelectKeys);
  }

  @Override
  default <E2> SocialTraversal<S, E2> select(final Pop pop, final String selectKey) {
    return (SocialTraversal) SocialTraversalDsl.super.select(pop,selectKey);
  }

  @Override
  default <E2> SocialTraversal<S, E2> select(final String selectKey) {
    return (SocialTraversal) SocialTraversalDsl.super.select(selectKey);
  }

  @Override
  default <E2> SocialTraversal<S, E2> select(final Pop pop, final Traversal<S, E2> keyTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.select(pop,keyTraversal);
  }

  @Override
  default <E2> SocialTraversal<S, E2> select(final Traversal<S, E2> keyTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.select(keyTraversal);
  }

  @Override
  default <E2> SocialTraversal<S, Collection<E2>> select(final Column column) {
    return (SocialTraversal) SocialTraversalDsl.super.select(column);
  }

  @Override
  default <E2> SocialTraversal<S, E2> unfold() {
    return (SocialTraversal) SocialTraversalDsl.super.unfold();
  }

  @Override
  default SocialTraversal<S, List<E>> fold() {
    return (SocialTraversal) SocialTraversalDsl.super.fold();
  }

  @Override
  default <E2> SocialTraversal<S, E2> fold(final E2 seed,
      final BiFunction<E2, E, E2> foldFunction) {
    return (SocialTraversal) SocialTraversalDsl.super.fold(seed,foldFunction);
  }

  @Override
  default SocialTraversal<S, Long> count() {
    return (SocialTraversal) SocialTraversalDsl.super.count();
  }

  @Override
  default SocialTraversal<S, Long> count(final Scope scope) {
    return (SocialTraversal) SocialTraversalDsl.super.count(scope);
  }

  @Override
  default <E2 extends Number> SocialTraversal<S, E2> sum() {
    return (SocialTraversal) SocialTraversalDsl.super.sum();
  }

  @Override
  default <E2 extends Number> SocialTraversal<S, E2> sum(final Scope scope) {
    return (SocialTraversal) SocialTraversalDsl.super.sum(scope);
  }

  @Override
  default <E2 extends Comparable> SocialTraversal<S, E2> max() {
    return (SocialTraversal) SocialTraversalDsl.super.max();
  }

  @Override
  default <E2 extends Comparable> SocialTraversal<S, E2> max(final Scope scope) {
    return (SocialTraversal) SocialTraversalDsl.super.max(scope);
  }

  @Override
  default <E2 extends Comparable> SocialTraversal<S, E2> min() {
    return (SocialTraversal) SocialTraversalDsl.super.min();
  }

  @Override
  default <E2 extends Comparable> SocialTraversal<S, E2> min(final Scope scope) {
    return (SocialTraversal) SocialTraversalDsl.super.min(scope);
  }

  @Override
  default <E2 extends Number> SocialTraversal<S, E2> mean() {
    return (SocialTraversal) SocialTraversalDsl.super.mean();
  }

  @Override
  default <E2 extends Number> SocialTraversal<S, E2> mean(final Scope scope) {
    return (SocialTraversal) SocialTraversalDsl.super.mean(scope);
  }

  @Override
  default <K, V> SocialTraversal<S, Map<K, V>> group() {
    return (SocialTraversal) SocialTraversalDsl.super.group();
  }

  @Override
  default <K> SocialTraversal<S, Map<K, Long>> groupCount() {
    return (SocialTraversal) SocialTraversalDsl.super.groupCount();
  }

  @Override
  default SocialTraversal<S, Tree> tree() {
    return (SocialTraversal) SocialTraversalDsl.super.tree();
  }

  @Override
  default SocialTraversal<S, Vertex> addV(final String vertexLabel) {
    return (SocialTraversal) SocialTraversalDsl.super.addV(vertexLabel);
  }

  @Override
  default SocialTraversal<S, Vertex> addV(final Traversal<?, String> vertexLabelTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.addV(vertexLabelTraversal);
  }

  @Override
  default SocialTraversal<S, Vertex> addV() {
    return (SocialTraversal) SocialTraversalDsl.super.addV();
  }

  @Override
  default SocialTraversal<S, Vertex> mergeV() {
    return (SocialTraversal) SocialTraversalDsl.super.mergeV();
  }

  @Override
  default SocialTraversal<S, Vertex> mergeV(final Map<Object, Object> searchCreate) {
    return (SocialTraversal) SocialTraversalDsl.super.mergeV(searchCreate);
  }

  @Override
  default SocialTraversal<S, Vertex> mergeV(final Traversal<?, Map<Object, Object>> searchCreate) {
    return (SocialTraversal) SocialTraversalDsl.super.mergeV(searchCreate);
  }

  @Override
  default SocialTraversal<S, Edge> mergeE() {
    return (SocialTraversal) SocialTraversalDsl.super.mergeE();
  }

  @Override
  default SocialTraversal<S, Edge> mergeE(final Map<Object, Object> searchCreate) {
    return (SocialTraversal) SocialTraversalDsl.super.mergeE(searchCreate);
  }

  @Override
  default SocialTraversal<S, Edge> mergeE(final Traversal<?, Map<Object, Object>> searchCreate) {
    return (SocialTraversal) SocialTraversalDsl.super.mergeE(searchCreate);
  }

  @Override
  default SocialTraversal<S, Edge> addE(final String edgeLabel) {
    return (SocialTraversal) SocialTraversalDsl.super.addE(edgeLabel);
  }

  @Override
  default SocialTraversal<S, Edge> addE(final Traversal<?, String> edgeLabelTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.addE(edgeLabelTraversal);
  }

  @Override
  default SocialTraversal<S, E> to(final String toStepLabel) {
    return (SocialTraversal) SocialTraversalDsl.super.to(toStepLabel);
  }

  @Override
  default SocialTraversal<S, E> from(final String fromStepLabel) {
    return (SocialTraversal) SocialTraversalDsl.super.from(fromStepLabel);
  }

  @Override
  default SocialTraversal<S, E> to(final Traversal<?, Vertex> toVertex) {
    return (SocialTraversal) SocialTraversalDsl.super.to(toVertex);
  }

  @Override
  default SocialTraversal<S, E> from(final Traversal<?, Vertex> fromVertex) {
    return (SocialTraversal) SocialTraversalDsl.super.from(fromVertex);
  }

  @Override
  default SocialTraversal<S, E> to(final Vertex toVertex) {
    return (SocialTraversal) SocialTraversalDsl.super.to(toVertex);
  }

  @Override
  default SocialTraversal<S, E> from(final Vertex fromVertex) {
    return (SocialTraversal) SocialTraversalDsl.super.from(fromVertex);
  }

  @Override
  default SocialTraversal<S, Double> math(final String expression) {
    return (SocialTraversal) SocialTraversalDsl.super.math(expression);
  }

  @Override
  default SocialTraversal<S, Element> element() {
    return (SocialTraversal) SocialTraversalDsl.super.element();
  }

  @Override
  default <E> SocialTraversal<S, E> call(final String service) {
    return (SocialTraversal) SocialTraversalDsl.super.call(service);
  }

  @Override
  default <E> SocialTraversal<S, E> call(final String service, final Map params) {
    return (SocialTraversal) SocialTraversalDsl.super.call(service,params);
  }

  @Override
  default <E> SocialTraversal<S, E> call(final String service,
      final Traversal<?, Map<?, ?>> childTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.call(service,childTraversal);
  }

  @Override
  default <E> SocialTraversal<S, E> call(final String service, final Map params,
      final Traversal<?, Map<?, ?>> childTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.call(service,params,childTraversal);
  }

  @Override
  default SocialTraversal<S, E> filter(final Predicate<Traverser<E>> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.filter(predicate);
  }

  @Override
  default SocialTraversal<S, E> filter(final Traversal<?, ?> filterTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.filter(filterTraversal);
  }

  @Override
  default SocialTraversal<S, E> none() {
    return (SocialTraversal) SocialTraversalDsl.super.none();
  }

  @Override
  default SocialTraversal<S, E> or(final Traversal<?, ?>... orTraversals) {
    return (SocialTraversal) SocialTraversalDsl.super.or(orTraversals);
  }

  @Override
  default SocialTraversal<S, E> and(final Traversal<?, ?>... andTraversals) {
    return (SocialTraversal) SocialTraversalDsl.super.and(andTraversals);
  }

  @Override
  default SocialTraversal<S, E> inject(final E... injections) {
    return (SocialTraversal) SocialTraversalDsl.super.inject(injections);
  }

  @Override
  default SocialTraversal<S, E> dedup(final Scope scope, final String... dedupLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.dedup(scope,dedupLabels);
  }

  @Override
  default SocialTraversal<S, E> dedup(final String... dedupLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.dedup(dedupLabels);
  }

  @Override
  default SocialTraversal<S, E> where(final String startKey, final P<String> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.where(startKey,predicate);
  }

  @Override
  default SocialTraversal<S, E> where(final P<String> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.where(predicate);
  }

  @Override
  default SocialTraversal<S, E> where(final Traversal<?, ?> whereTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.where(whereTraversal);
  }

  @Override
  default SocialTraversal<S, E> has(final String propertyKey, final P<?> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.has(propertyKey,predicate);
  }

  @Override
  default SocialTraversal<S, E> has(final T accessor, final P<?> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.has(accessor,predicate);
  }

  @Override
  default SocialTraversal<S, E> has(final String propertyKey, final Object value) {
    return (SocialTraversal) SocialTraversalDsl.super.has(propertyKey,value);
  }

  @Override
  default SocialTraversal<S, E> has(final T accessor, final Object value) {
    return (SocialTraversal) SocialTraversalDsl.super.has(accessor,value);
  }

  @Override
  default SocialTraversal<S, E> has(final String label, final String propertyKey,
      final P<?> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.has(label,propertyKey,predicate);
  }

  @Override
  default SocialTraversal<S, E> has(final String label, final String propertyKey,
      final Object value) {
    return (SocialTraversal) SocialTraversalDsl.super.has(label,propertyKey,value);
  }

  @Override
  default SocialTraversal<S, E> has(final T accessor, final Traversal<?, ?> propertyTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.has(accessor,propertyTraversal);
  }

  @Override
  default SocialTraversal<S, E> has(final String propertyKey,
      final Traversal<?, ?> propertyTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.has(propertyKey,propertyTraversal);
  }

  @Override
  default SocialTraversal<S, E> has(final String propertyKey) {
    return (SocialTraversal) SocialTraversalDsl.super.has(propertyKey);
  }

  @Override
  default SocialTraversal<S, E> hasNot(final String propertyKey) {
    return (SocialTraversal) SocialTraversalDsl.super.hasNot(propertyKey);
  }

  @Override
  default SocialTraversal<S, E> hasLabel(final String label, final String... otherLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.hasLabel(label,otherLabels);
  }

  @Override
  default SocialTraversal<S, E> hasLabel(final P<String> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.hasLabel(predicate);
  }

  @Override
  default SocialTraversal<S, E> hasId(final Object id, final Object... otherIds) {
    return (SocialTraversal) SocialTraversalDsl.super.hasId(id,otherIds);
  }

  @Override
  default SocialTraversal<S, E> hasId(final P<Object> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.hasId(predicate);
  }

  @Override
  default SocialTraversal<S, E> hasKey(final String label, final String... otherLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.hasKey(label,otherLabels);
  }

  @Override
  default SocialTraversal<S, E> hasKey(final P<String> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.hasKey(predicate);
  }

  @Override
  default SocialTraversal<S, E> hasValue(final Object value, final Object... otherValues) {
    return (SocialTraversal) SocialTraversalDsl.super.hasValue(value,otherValues);
  }

  @Override
  default SocialTraversal<S, E> hasValue(final P<Object> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.hasValue(predicate);
  }

  @Override
  default SocialTraversal<S, E> is(final P<E> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.is(predicate);
  }

  @Override
  default SocialTraversal<S, E> is(final Object value) {
    return (SocialTraversal) SocialTraversalDsl.super.is(value);
  }

  @Override
  default SocialTraversal<S, E> not(final Traversal<?, ?> notTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.not(notTraversal);
  }

  @Override
  default SocialTraversal<S, E> coin(final double probability) {
    return (SocialTraversal) SocialTraversalDsl.super.coin(probability);
  }

  @Override
  default SocialTraversal<S, E> range(final long low, final long high) {
    return (SocialTraversal) SocialTraversalDsl.super.range(low,high);
  }

  @Override
  default <E2> SocialTraversal<S, E2> range(final Scope scope, final long low, final long high) {
    return (SocialTraversal) SocialTraversalDsl.super.range(scope,low,high);
  }

  @Override
  default SocialTraversal<S, E> limit(final long limit) {
    return (SocialTraversal) SocialTraversalDsl.super.limit(limit);
  }

  @Override
  default <E2> SocialTraversal<S, E2> limit(final Scope scope, final long limit) {
    return (SocialTraversal) SocialTraversalDsl.super.limit(scope,limit);
  }

  @Override
  default SocialTraversal<S, E> tail() {
    return (SocialTraversal) SocialTraversalDsl.super.tail();
  }

  @Override
  default SocialTraversal<S, E> tail(final long limit) {
    return (SocialTraversal) SocialTraversalDsl.super.tail(limit);
  }

  @Override
  default <E2> SocialTraversal<S, E2> tail(final Scope scope) {
    return (SocialTraversal) SocialTraversalDsl.super.tail(scope);
  }

  @Override
  default <E2> SocialTraversal<S, E2> tail(final Scope scope, final long limit) {
    return (SocialTraversal) SocialTraversalDsl.super.tail(scope,limit);
  }

  @Override
  default SocialTraversal<S, E> skip(final long skip) {
    return (SocialTraversal) SocialTraversalDsl.super.skip(skip);
  }

  @Override
  default <E2> SocialTraversal<S, E2> skip(final Scope scope, final long skip) {
    return (SocialTraversal) SocialTraversalDsl.super.skip(scope,skip);
  }

  @Override
  default SocialTraversal<S, E> timeLimit(final long timeLimit) {
    return (SocialTraversal) SocialTraversalDsl.super.timeLimit(timeLimit);
  }

  @Override
  default SocialTraversal<S, E> simplePath() {
    return (SocialTraversal) SocialTraversalDsl.super.simplePath();
  }

  @Override
  default SocialTraversal<S, E> cyclicPath() {
    return (SocialTraversal) SocialTraversalDsl.super.cyclicPath();
  }

  @Override
  default SocialTraversal<S, E> sample(final int amountToSample) {
    return (SocialTraversal) SocialTraversalDsl.super.sample(amountToSample);
  }

  @Override
  default SocialTraversal<S, E> sample(final Scope scope, final int amountToSample) {
    return (SocialTraversal) SocialTraversalDsl.super.sample(scope,amountToSample);
  }

  @Override
  default SocialTraversal<S, E> drop() {
    return (SocialTraversal) SocialTraversalDsl.super.drop();
  }

  @Override
  default SocialTraversal<S, E> sideEffect(final Consumer<Traverser<E>> consumer) {
    return (SocialTraversal) SocialTraversalDsl.super.sideEffect(consumer);
  }

  @Override
  default SocialTraversal<S, E> sideEffect(final Traversal<?, ?> sideEffectTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.sideEffect(sideEffectTraversal);
  }

  @Override
  default <E2> SocialTraversal<S, E2> cap(final String sideEffectKey,
      final String... sideEffectKeys) {
    return (SocialTraversal) SocialTraversalDsl.super.cap(sideEffectKey,sideEffectKeys);
  }

  @Override
  default SocialTraversal<S, Edge> subgraph(final String sideEffectKey) {
    return (SocialTraversal) SocialTraversalDsl.super.subgraph(sideEffectKey);
  }

  @Override
  default SocialTraversal<S, E> aggregate(final String sideEffectKey) {
    return (SocialTraversal) SocialTraversalDsl.super.aggregate(sideEffectKey);
  }

  @Override
  default SocialTraversal<S, E> aggregate(final Scope scope, final String sideEffectKey) {
    return (SocialTraversal) SocialTraversalDsl.super.aggregate(scope,sideEffectKey);
  }

  @Override
  default SocialTraversal<S, E> group(final String sideEffectKey) {
    return (SocialTraversal) SocialTraversalDsl.super.group(sideEffectKey);
  }

  @Override
  default SocialTraversal<S, E> groupCount(final String sideEffectKey) {
    return (SocialTraversal) SocialTraversalDsl.super.groupCount(sideEffectKey);
  }

  @Override
  default SocialTraversal<S, E> fail() {
    return (SocialTraversal) SocialTraversalDsl.super.fail();
  }

  @Override
  default SocialTraversal<S, E> fail(final String message) {
    return (SocialTraversal) SocialTraversalDsl.super.fail(message);
  }

  @Override
  default SocialTraversal<S, E> tree(final String sideEffectKey) {
    return (SocialTraversal) SocialTraversalDsl.super.tree(sideEffectKey);
  }

  @Override
  default <V, U> SocialTraversal<S, E> sack(final BiFunction<V, U, V> sackOperator) {
    return (SocialTraversal) SocialTraversalDsl.super.sack(sackOperator);
  }

  @Override
  default SocialTraversal<S, E> store(final String sideEffectKey) {
    return (SocialTraversal) SocialTraversalDsl.super.store(sideEffectKey);
  }

  @Override
  default SocialTraversal<S, E> profile(final String sideEffectKey) {
    return (SocialTraversal) SocialTraversalDsl.super.profile(sideEffectKey);
  }

  @Override
  default SocialTraversal<S, TraversalMetrics> profile() {
    return (SocialTraversal) SocialTraversalDsl.super.profile();
  }

  @Override
  default SocialTraversal<S, E> property(final VertexProperty.Cardinality cardinality,
      final Object key, final Object value, final Object... keyValues) {
    return (SocialTraversal) SocialTraversalDsl.super.property(cardinality,key,value,keyValues);
  }

  @Override
  default SocialTraversal<S, E> property(final Object key, final Object value,
      final Object... keyValues) {
    return (SocialTraversal) SocialTraversalDsl.super.property(key,value,keyValues);
  }

  @Override
  default SocialTraversal<S, E> property(final Map<Object, Object> value) {
    return (SocialTraversal) SocialTraversalDsl.super.property(value);
  }

  @Override
  default <M, E2> SocialTraversal<S, E2> branch(final Traversal<?, M> branchTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.branch(branchTraversal);
  }

  @Override
  default <M, E2> SocialTraversal<S, E2> branch(final Function<Traverser<E>, M> function) {
    return (SocialTraversal) SocialTraversalDsl.super.branch(function);
  }

  @Override
  default <M, E2> SocialTraversal<S, E2> choose(final Traversal<?, M> choiceTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.choose(choiceTraversal);
  }

  @Override
  default <E2> SocialTraversal<S, E2> choose(final Traversal<?, ?> traversalPredicate,
      final Traversal<?, E2> trueChoice, final Traversal<?, E2> falseChoice) {
    return (SocialTraversal) SocialTraversalDsl.super.choose(traversalPredicate,trueChoice,falseChoice);
  }

  @Override
  default <E2> SocialTraversal<S, E2> choose(final Traversal<?, ?> traversalPredicate,
      final Traversal<?, E2> trueChoice) {
    return (SocialTraversal) SocialTraversalDsl.super.choose(traversalPredicate,trueChoice);
  }

  @Override
  default <M, E2> SocialTraversal<S, E2> choose(final Function<E, M> choiceFunction) {
    return (SocialTraversal) SocialTraversalDsl.super.choose(choiceFunction);
  }

  @Override
  default <E2> SocialTraversal<S, E2> choose(final Predicate<E> choosePredicate,
      final Traversal<?, E2> trueChoice, final Traversal<?, E2> falseChoice) {
    return (SocialTraversal) SocialTraversalDsl.super.choose(choosePredicate,trueChoice,falseChoice);
  }

  @Override
  default <E2> SocialTraversal<S, E2> choose(final Predicate<E> choosePredicate,
      final Traversal<?, E2> trueChoice) {
    return (SocialTraversal) SocialTraversalDsl.super.choose(choosePredicate,trueChoice);
  }

  @Override
  default <E2> SocialTraversal<S, E2> optional(final Traversal<?, E2> optionalTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.optional(optionalTraversal);
  }

  @Override
  default <E2> SocialTraversal<S, E2> union(final Traversal<?, E2>... unionTraversals) {
    return (SocialTraversal) SocialTraversalDsl.super.union(unionTraversals);
  }

  @Override
  default <E2> SocialTraversal<S, E2> coalesce(final Traversal<?, E2>... coalesceTraversals) {
    return (SocialTraversal) SocialTraversalDsl.super.coalesce(coalesceTraversals);
  }

  @Override
  default SocialTraversal<S, E> repeat(final Traversal<?, E> repeatTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.repeat(repeatTraversal);
  }

  @Override
  default SocialTraversal<S, E> repeat(final String loopName,
      final Traversal<?, E> repeatTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.repeat(loopName,repeatTraversal);
  }

  @Override
  default SocialTraversal<S, E> emit(final Traversal<?, ?> emitTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.emit(emitTraversal);
  }

  @Override
  default SocialTraversal<S, E> emit(final Predicate<Traverser<E>> emitPredicate) {
    return (SocialTraversal) SocialTraversalDsl.super.emit(emitPredicate);
  }

  @Override
  default SocialTraversal<S, E> emit() {
    return (SocialTraversal) SocialTraversalDsl.super.emit();
  }

  @Override
  default SocialTraversal<S, E> until(final Traversal<?, ?> untilTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.until(untilTraversal);
  }

  @Override
  default SocialTraversal<S, E> until(final Predicate<Traverser<E>> untilPredicate) {
    return (SocialTraversal) SocialTraversalDsl.super.until(untilPredicate);
  }

  @Override
  default SocialTraversal<S, E> times(final int maxLoops) {
    return (SocialTraversal) SocialTraversalDsl.super.times(maxLoops);
  }

  @Override
  default <E2> SocialTraversal<S, E2> local(final Traversal<?, E2> localTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.local(localTraversal);
  }

  @Override
  default SocialTraversal<S, E> pageRank() {
    return (SocialTraversal) SocialTraversalDsl.super.pageRank();
  }

  @Override
  default SocialTraversal<S, E> pageRank(final double alpha) {
    return (SocialTraversal) SocialTraversalDsl.super.pageRank(alpha);
  }

  @Override
  default SocialTraversal<S, E> peerPressure() {
    return (SocialTraversal) SocialTraversalDsl.super.peerPressure();
  }

  @Override
  default SocialTraversal<S, E> connectedComponent() {
    return (SocialTraversal) SocialTraversalDsl.super.connectedComponent();
  }

  @Override
  default SocialTraversal<S, Path> shortestPath() {
    return (SocialTraversal) SocialTraversalDsl.super.shortestPath();
  }

  @Override
  default SocialTraversal<S, E> program(final VertexProgram<?> vertexProgram) {
    return (SocialTraversal) SocialTraversalDsl.super.program(vertexProgram);
  }

  @Override
  default SocialTraversal<S, E> as(final String stepLabel, final String... stepLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.as(stepLabel,stepLabels);
  }

  @Override
  default SocialTraversal<S, E> barrier() {
    return (SocialTraversal) SocialTraversalDsl.super.barrier();
  }

  @Override
  default SocialTraversal<S, E> barrier(final int maxBarrierSize) {
    return (SocialTraversal) SocialTraversalDsl.super.barrier(maxBarrierSize);
  }

  @Override
  default <E2> SocialTraversal<S, E2> index() {
    return (SocialTraversal) SocialTraversalDsl.super.index();
  }

  @Override
  default SocialTraversal<S, E> barrier(final Consumer<TraverserSet<Object>> barrierConsumer) {
    return (SocialTraversal) SocialTraversalDsl.super.barrier(barrierConsumer);
  }

  @Override
  default SocialTraversal<S, E> with(final String key) {
    return (SocialTraversal) SocialTraversalDsl.super.with(key);
  }

  @Override
  default SocialTraversal<S, E> with(final String key, final Object value) {
    return (SocialTraversal) SocialTraversalDsl.super.with(key,value);
  }

  @Override
  default SocialTraversal<S, E> by() {
    return (SocialTraversal) SocialTraversalDsl.super.by();
  }

  @Override
  default SocialTraversal<S, E> by(final Traversal<?, ?> traversal) {
    return (SocialTraversal) SocialTraversalDsl.super.by(traversal);
  }

  @Override
  default SocialTraversal<S, E> by(final T token) {
    return (SocialTraversal) SocialTraversalDsl.super.by(token);
  }

  @Override
  default SocialTraversal<S, E> by(final String key) {
    return (SocialTraversal) SocialTraversalDsl.super.by(key);
  }

  @Override
  default <V> SocialTraversal<S, E> by(final Function<V, Object> function) {
    return (SocialTraversal) SocialTraversalDsl.super.by(function);
  }

  @Override
  default <V> SocialTraversal<S, E> by(final Traversal<?, ?> traversal,
      final Comparator<V> comparator) {
    return (SocialTraversal) SocialTraversalDsl.super.by(traversal,comparator);
  }

  @Override
  default SocialTraversal<S, E> by(final Comparator<E> comparator) {
    return (SocialTraversal) SocialTraversalDsl.super.by(comparator);
  }

  @Override
  default SocialTraversal<S, E> by(final Order order) {
    return (SocialTraversal) SocialTraversalDsl.super.by(order);
  }

  @Override
  default <V> SocialTraversal<S, E> by(final String key, final Comparator<V> comparator) {
    return (SocialTraversal) SocialTraversalDsl.super.by(key,comparator);
  }

  @Override
  default <U> SocialTraversal<S, E> by(final Function<U, Object> function,
      final Comparator comparator) {
    return (SocialTraversal) SocialTraversalDsl.super.by(function,comparator);
  }

  @Override
  default <M, E2> SocialTraversal<S, E> option(final M token,
      final Traversal<?, E2> traversalOption) {
    return (SocialTraversal) SocialTraversalDsl.super.option(token,traversalOption);
  }

  @Override
  default <M, E2> SocialTraversal<S, E> option(final M token, final Map<Object, Object> m) {
    return (SocialTraversal) SocialTraversalDsl.super.option(token,m);
  }

  @Override
  default <E2> SocialTraversal<S, E> option(final Traversal<?, E2> traversalOption) {
    return (SocialTraversal) SocialTraversalDsl.super.option(traversalOption);
  }

  @Override
  default SocialTraversal<S, E> read() {
    return (SocialTraversal) SocialTraversalDsl.super.read();
  }

  @Override
  default SocialTraversal<S, E> write() {
    return (SocialTraversal) SocialTraversalDsl.super.write();
  }

  @Override
  default SocialTraversal<S, E> iterate() {
    SocialTraversalDsl.super.iterate();
    return this;
  }
}
