package payment;

import java.lang.Comparable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Number;
import java.lang.Object;
import java.lang.String;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.apache.tinkerpop.gremlin.process.traversal.P;
import org.apache.tinkerpop.gremlin.process.traversal.Path;
import org.apache.tinkerpop.gremlin.process.traversal.Pop;
import org.apache.tinkerpop.gremlin.process.traversal.Scope;
import org.apache.tinkerpop.gremlin.process.traversal.Traversal;
import org.apache.tinkerpop.gremlin.process.traversal.Traverser;
import org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree;
import org.apache.tinkerpop.gremlin.process.traversal.traverser.util.TraverserSet;
import org.apache.tinkerpop.gremlin.structure.Column;
import org.apache.tinkerpop.gremlin.structure.Direction;
import org.apache.tinkerpop.gremlin.structure.Edge;
import org.apache.tinkerpop.gremlin.structure.Element;
import org.apache.tinkerpop.gremlin.structure.Property;
import org.apache.tinkerpop.gremlin.structure.T;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.apache.tinkerpop.gremlin.structure.VertexProperty;

public final class __ {
  private __() {
  }

  public static <A> SocialTraversal<A, A> start() {
    return new DefaultSocialTraversal<>();
  }

  public static <S> SocialTraversal<S, Vertex> knows(String personName) {
    return __.<S>start().knows(personName);
  }

  public static <E2 extends Number, S> SocialTraversal<S, E2> youngestFriendsAge() {
    return __.<S>start().youngestFriendsAge();
  }

  public static <S> SocialTraversal<S, Long> createdAtLeast(int number) {
    return __.<S>start().createdAtLeast(number);
  }

  public static <A> SocialTraversal<A, A> person() {
    return __.<A>start().person();
  }

  public static <A> SocialTraversal<A, A> __(final A... starts) {
    return inject(starts);
  }

  public static <A, B> SocialTraversal<A, B> map(final Function<Traverser<A>, B> function) {
    return __.<A>start().map(function);
  }

  public static <A, B> SocialTraversal<A, B> map(final Traversal<?, B> mapTraversal) {
    return __.<A>start().map(mapTraversal);
  }

  public static <A, B> SocialTraversal<A, B> flatMap(
      final Function<Traverser<A>, Iterator<B>> function) {
    return __.<A>start().flatMap(function);
  }

  public static <A, B> SocialTraversal<A, B> flatMap(final Traversal<?, B> flatMapTraversal) {
    return __.<A>start().flatMap(flatMapTraversal);
  }

  public static <A> SocialTraversal<A, A> identity() {
    return __.<A>start().identity();
  }

  public static <A> SocialTraversal<A, A> constant(final A a) {
    return __.<A>start().constant(a);
  }

  public static <A extends Element> SocialTraversal<A, String> label() {
    return __.<A>start().label();
  }

  public static <A extends Element> SocialTraversal<A, Object> id() {
    return __.<A>start().id();
  }

  public static <A> SocialTraversal<A, Vertex> V(final Object... vertexIdsOrElements) {
    return __.<A>start().V(vertexIdsOrElements);
  }

  public static SocialTraversal<Vertex, Vertex> to(final Direction direction,
      final String... edgeLabels) {
    return __.<Vertex>start().to(direction,edgeLabels);
  }

  public static SocialTraversal<Vertex, Vertex> out(final String... edgeLabels) {
    return __.<Vertex>start().out(edgeLabels);
  }

  public static SocialTraversal<Vertex, Vertex> in(final String... edgeLabels) {
    return __.<Vertex>start().in(edgeLabels);
  }

  public static SocialTraversal<Vertex, Vertex> both(final String... edgeLabels) {
    return __.<Vertex>start().both(edgeLabels);
  }

  public static SocialTraversal<Vertex, Edge> toE(final Direction direction,
      final String... edgeLabels) {
    return __.<Vertex>start().toE(direction,edgeLabels);
  }

  public static SocialTraversal<Vertex, Edge> outE(final String... edgeLabels) {
    return __.<Vertex>start().outE(edgeLabels);
  }

  public static SocialTraversal<Vertex, Edge> inE(final String... edgeLabels) {
    return __.<Vertex>start().inE(edgeLabels);
  }

  public static SocialTraversal<Vertex, Edge> bothE(final String... edgeLabels) {
    return __.<Vertex>start().bothE(edgeLabels);
  }

  public static SocialTraversal<Edge, Vertex> toV(final Direction direction) {
    return __.<Edge>start().toV(direction);
  }

  public static SocialTraversal<Edge, Vertex> inV() {
    return __.<Edge>start().inV();
  }

  public static SocialTraversal<Edge, Vertex> outV() {
    return __.<Edge>start().outV();
  }

  public static SocialTraversal<Edge, Vertex> bothV() {
    return __.<Edge>start().bothV();
  }

  public static SocialTraversal<Edge, Vertex> otherV() {
    return __.<Edge>start().otherV();
  }

  public static <A> SocialTraversal<A, A> order() {
    return __.<A>start().order();
  }

  public static <A> SocialTraversal<A, A> order(final Scope scope) {
    return __.<A>start().order(scope);
  }

  public static <A extends Element, B> SocialTraversal<A, ? extends Property<B>> properties(
      final String... propertyKeys) {
    return __.<A>start().properties(propertyKeys);
  }

  public static <A extends Element, B> SocialTraversal<A, B> values(final String... propertyKeys) {
    return __.<A>start().values(propertyKeys);
  }

  public static <A extends Element, B> SocialTraversal<A, Map<String, B>> propertyMap(
      final String... propertyKeys) {
    return __.<A>start().propertyMap(propertyKeys);
  }

  public static <A extends Element, B> SocialTraversal<A, Map<Object, B>> elementMap(
      final String... propertyKeys) {
    return __.<A>start().elementMap(propertyKeys);
  }

  public static <A extends Element, B> SocialTraversal<A, Map<Object, B>> valueMap(
      final String... propertyKeys) {
    return __.<A>start().valueMap(propertyKeys);
  }

  public static <A extends Element, B> SocialTraversal<A, Map<Object, B>> valueMap(
      final boolean includeTokens, final String... propertyKeys) {
    return __.<A>start().valueMap(includeTokens,propertyKeys);
  }

  public static <A, B> SocialTraversal<A, Map<String, B>> project(final String projectKey,
      final String... projectKeys) {
    return __.<A>start().project(projectKey,projectKeys);
  }

  public static <A, B> SocialTraversal<A, Collection<B>> select(final Column column) {
    return __.<A>start().select(column);
  }

  public static <A extends Property> SocialTraversal<A, String> key() {
    return __.<A>start().key();
  }

  public static <A extends Property, B> SocialTraversal<A, B> value() {
    return __.<A>start().value();
  }

  public static <A> SocialTraversal<A, Path> path() {
    return __.<A>start().path();
  }

  public static <A, B> SocialTraversal<A, Map<String, B>> match(
      final Traversal<?, ?>... matchTraversals) {
    return __.<A>start().match(matchTraversals);
  }

  public static <A, B> SocialTraversal<A, B> sack() {
    return __.<A>start().sack();
  }

  public static <A> SocialTraversal<A, Integer> loops() {
    return __.<A>start().loops();
  }

  public static <A> SocialTraversal<A, Integer> loops(final String loopName) {
    return __.<A>start().loops(loopName);
  }

  public static <A, B> SocialTraversal<A, B> select(final Pop pop, final String selectKey) {
    return __.<A>start().select(pop,selectKey);
  }

  public static <A, B> SocialTraversal<A, B> select(final String selectKey) {
    return __.<A>start().select(selectKey);
  }

  public static <A, B> SocialTraversal<A, Map<String, B>> select(final Pop pop,
      final String selectKey1, final String selectKey2, final String... otherSelectKeys) {
    return __.<A>start().select(pop,selectKey1,selectKey2,otherSelectKeys);
  }

  public static <A, B> SocialTraversal<A, Map<String, B>> select(final String selectKey1,
      final String selectKey2, final String... otherSelectKeys) {
    return __.<A>start().select(selectKey1,selectKey2,otherSelectKeys);
  }

  public static <A, B> SocialTraversal<A, B> select(final Pop pop,
      final Traversal<A, B> keyTraversal) {
    return __.<A>start().select(pop,keyTraversal);
  }

  public static <A, B> SocialTraversal<A, B> select(final Traversal<A, B> keyTraversal) {
    return __.<A>start().select(keyTraversal);
  }

  public static <A> SocialTraversal<A, A> unfold() {
    return __.<A>start().unfold();
  }

  public static <A> SocialTraversal<A, List<A>> fold() {
    return __.<A>start().fold();
  }

  public static <A, B> SocialTraversal<A, B> fold(final B seed,
      final BiFunction<B, A, B> foldFunction) {
    return __.<A>start().fold(seed,foldFunction);
  }

  public static <A> SocialTraversal<A, Long> count() {
    return __.<A>start().count();
  }

  public static <A> SocialTraversal<A, Long> count(final Scope scope) {
    return __.<A>start().count(scope);
  }

  public static <A> SocialTraversal<A, Double> sum() {
    return __.<A>start().sum();
  }

  public static <A> SocialTraversal<A, Double> sum(final Scope scope) {
    return __.<A>start().sum(scope);
  }

  public static <A, B extends Comparable> SocialTraversal<A, B> min() {
    return __.<A>start().min();
  }

  public static <A, B extends Comparable> SocialTraversal<A, B> min(final Scope scope) {
    return __.<A>start().min(scope);
  }

  public static <A, B extends Comparable> SocialTraversal<A, B> max() {
    return __.<A>start().max();
  }

  public static <A, B extends Comparable> SocialTraversal<A, B> max(final Scope scope) {
    return __.<A>start().max(scope);
  }

  public static <A> SocialTraversal<A, Double> mean() {
    return __.<A>start().mean();
  }

  public static <A> SocialTraversal<A, Double> mean(final Scope scope) {
    return __.<A>start().mean(scope);
  }

  public static <A, K, V> SocialTraversal<A, Map<K, V>> group() {
    return __.<A>start().group();
  }

  public static <A, K> SocialTraversal<A, Map<K, Long>> groupCount() {
    return __.<A>start().groupCount();
  }

  public static <A> SocialTraversal<A, Tree> tree() {
    return __.<A>start().tree();
  }

  public static <A> SocialTraversal<A, Vertex> addV(final String vertexLabel) {
    return __.<A>start().addV(vertexLabel);
  }

  public static <A> SocialTraversal<A, Vertex> addV(
      final Traversal<?, String> vertexLabelTraversal) {
    return __.<A>start().addV(vertexLabelTraversal);
  }

  public static <A> SocialTraversal<A, Vertex> addV() {
    return __.<A>start().addV();
  }

  public static <A> SocialTraversal<A, Vertex> mergeV() {
    return __.<A>start().mergeV();
  }

  public static <A> SocialTraversal<A, Vertex> mergeV(final Map<Object, Object> searchCreate) {
    return __.<A>start().mergeV(searchCreate);
  }

  public static <A> SocialTraversal<A, Vertex> mergeV(
      final Traversal<?, Map<Object, Object>> searchCreate) {
    return __.<A>start().mergeV(searchCreate);
  }

  public static <A> SocialTraversal<A, Edge> addE(final String edgeLabel) {
    return __.<A>start().addE(edgeLabel);
  }

  public static <A> SocialTraversal<A, Edge> addE(final Traversal<?, String> edgeLabelTraversal) {
    return __.<A>start().addE(edgeLabelTraversal);
  }

  public static <A> SocialTraversal<A, Edge> mergeE() {
    return __.<A>start().mergeE();
  }

  public static <A> SocialTraversal<A, Edge> mergeE(final Map<Object, Object> searchCreate) {
    return __.<A>start().mergeE(searchCreate);
  }

  public static <A> SocialTraversal<A, Edge> mergeE(
      final Traversal<?, Map<Object, Object>> searchCreate) {
    return __.<A>start().mergeE(searchCreate);
  }

  public static <A> SocialTraversal<A, Double> math(final String expression) {
    return __.<A>start().math(expression);
  }

  public static <A> SocialTraversal<A, A> filter(final Predicate<Traverser<A>> predicate) {
    return __.<A>start().filter(predicate);
  }

  public static <A> SocialTraversal<A, A> filter(final Traversal<?, ?> filterTraversal) {
    return __.<A>start().filter(filterTraversal);
  }

  public static <A> SocialTraversal<A, A> and(final Traversal<?, ?>... andTraversals) {
    return __.<A>start().and(andTraversals);
  }

  public static <A> SocialTraversal<A, A> or(final Traversal<?, ?>... orTraversals) {
    return __.<A>start().or(orTraversals);
  }

  public static <A> SocialTraversal<A, A> inject(final A... injections) {
    return __.<A>start().inject(injections);
  }

  public static <A> SocialTraversal<A, A> dedup(final String... dedupLabels) {
    return __.<A>start().dedup(dedupLabels);
  }

  public static <A> SocialTraversal<A, A> dedup(final Scope scope, final String... dedupLabels) {
    return __.<A>start().dedup(scope,dedupLabels);
  }

  public static <A> SocialTraversal<A, A> has(final String propertyKey, final P<?> predicate) {
    return __.<A>start().has(propertyKey,predicate);
  }

  public static <A> SocialTraversal<A, A> has(final T accessor, final P<?> predicate) {
    return __.<A>start().has(accessor,predicate);
  }

  public static <A> SocialTraversal<A, A> has(final String propertyKey, final Object value) {
    return __.<A>start().has(propertyKey,value);
  }

  public static <A> SocialTraversal<A, A> has(final T accessor, final Object value) {
    return __.<A>start().has(accessor,value);
  }

  public static <A> SocialTraversal<A, A> has(final String label, final String propertyKey,
      final Object value) {
    return __.<A>start().has(label,propertyKey,value);
  }

  public static <A> SocialTraversal<A, A> has(final String label, final String propertyKey,
      final P<?> predicate) {
    return __.<A>start().has(label,propertyKey,predicate);
  }

  public static <A> SocialTraversal<A, A> has(final T accessor,
      final Traversal<?, ?> propertyTraversal) {
    return __.<A>start().has(accessor,propertyTraversal);
  }

  public static <A> SocialTraversal<A, A> has(final String propertyKey,
      final Traversal<?, ?> propertyTraversal) {
    return __.<A>start().has(propertyKey,propertyTraversal);
  }

  public static <A> SocialTraversal<A, A> has(final String propertyKey) {
    return __.<A>start().has(propertyKey);
  }

  public static <A> SocialTraversal<A, A> hasNot(final String propertyKey) {
    return __.<A>start().hasNot(propertyKey);
  }

  public static <A> SocialTraversal<A, A> hasLabel(final String label, String... otherLabels) {
    return __.<A>start().hasLabel(label,otherLabels);
  }

  public static <A> SocialTraversal<A, A> hasLabel(final P<String> predicate) {
    return __.<A>start().hasLabel(predicate);
  }

  public static <A> SocialTraversal<A, A> hasId(final Object id, Object... otherIds) {
    return __.<A>start().hasId(id,otherIds);
  }

  public static <A> SocialTraversal<A, A> hasId(final P<Object> predicate) {
    return __.<A>start().hasId(predicate);
  }

  public static <A> SocialTraversal<A, A> hasKey(final String label, String... otherLabels) {
    return __.<A>start().hasKey(label,otherLabels);
  }

  public static <A> SocialTraversal<A, A> hasKey(final P<String> predicate) {
    return __.<A>start().hasKey(predicate);
  }

  public static <A> SocialTraversal<A, A> hasValue(final Object value, Object... values) {
    return __.<A>start().hasValue(value,values);
  }

  public static <A> SocialTraversal<A, A> hasValue(final P<Object> predicate) {
    return __.<A>start().hasValue(predicate);
  }

  public static <A> SocialTraversal<A, A> where(final String startKey, final P<String> predicate) {
    return __.<A>start().where(startKey,predicate);
  }

  public static <A> SocialTraversal<A, A> where(final P<String> predicate) {
    return __.<A>start().where(predicate);
  }

  public static <A> SocialTraversal<A, A> where(final Traversal<?, ?> whereTraversal) {
    return __.<A>start().where(whereTraversal);
  }

  public static <A> SocialTraversal<A, A> is(final P<A> predicate) {
    return __.<A>start().is(predicate);
  }

  public static <A> SocialTraversal<A, A> is(final Object value) {
    return __.<A>start().is(value);
  }

  public static <A> SocialTraversal<A, A> not(final Traversal<?, ?> notTraversal) {
    return __.<A>start().not(notTraversal);
  }

  public static <A> SocialTraversal<A, A> coin(final double probability) {
    return __.<A>start().coin(probability);
  }

  public static <A> SocialTraversal<A, A> range(final long low, final long high) {
    return __.<A>start().range(low,high);
  }

  public static <A> SocialTraversal<A, A> range(final Scope scope, final long low,
      final long high) {
    return __.<A>start().range(scope,low,high);
  }

  public static <A> SocialTraversal<A, A> limit(final long limit) {
    return __.<A>start().limit(limit);
  }

  public static <A> SocialTraversal<A, A> limit(final Scope scope, final long limit) {
    return __.<A>start().limit(scope,limit);
  }

  public static <A> SocialTraversal<A, A> skip(final long skip) {
    return __.<A>start().skip(skip);
  }

  public static <A> SocialTraversal<A, A> skip(final Scope scope, final long skip) {
    return __.<A>start().skip(scope,skip);
  }

  public static <A> SocialTraversal<A, A> tail() {
    return __.<A>start().tail();
  }

  public static <A> SocialTraversal<A, A> tail(final long limit) {
    return __.<A>start().tail(limit);
  }

  public static <A> SocialTraversal<A, A> tail(final Scope scope) {
    return __.<A>start().tail(scope);
  }

  public static <A> SocialTraversal<A, A> tail(final Scope scope, final long limit) {
    return __.<A>start().tail(scope,limit);
  }

  public static <A> SocialTraversal<A, A> simplePath() {
    return __.<A>start().simplePath();
  }

  public static <A> SocialTraversal<A, A> cyclicPath() {
    return __.<A>start().cyclicPath();
  }

  public static <A> SocialTraversal<A, A> sample(final int amountToSample) {
    return __.<A>start().sample(amountToSample);
  }

  public static <A> SocialTraversal<A, A> sample(final Scope scope, final int amountToSample) {
    return __.<A>start().sample(scope,amountToSample);
  }

  public static <A> SocialTraversal<A, A> drop() {
    return __.<A>start().drop();
  }

  public static <A> SocialTraversal<A, A> sideEffect(final Consumer<Traverser<A>> consumer) {
    return __.<A>start().sideEffect(consumer);
  }

  public static <A> SocialTraversal<A, A> sideEffect(final Traversal<?, ?> sideEffectTraversal) {
    return __.<A>start().sideEffect(sideEffectTraversal);
  }

  public static <A, B> SocialTraversal<A, B> cap(final String sideEffectKey,
      String... sideEffectKeys) {
    return __.<A>start().cap(sideEffectKey,sideEffectKeys);
  }

  public static <A> SocialTraversal<A, Edge> subgraph(final String sideEffectKey) {
    return __.<A>start().subgraph(sideEffectKey);
  }

  public static <A> SocialTraversal<A, A> aggregate(final String sideEffectKey) {
    return __.<A>start().aggregate(sideEffectKey);
  }

  public static <A> SocialTraversal<A, A> aggregate(final Scope scope, final String sideEffectKey) {
    return __.<A>start().aggregate(scope,sideEffectKey);
  }

  public static <A> SocialTraversal<A, A> fail() {
    return __.<A>start().fail();
  }

  public static <A> SocialTraversal<A, A> fail(final String message) {
    return __.<A>start().fail(message);
  }

  public static <A> SocialTraversal<A, A> group(final String sideEffectKey) {
    return __.<A>start().group(sideEffectKey);
  }

  public static <A> SocialTraversal<A, A> groupCount(final String sideEffectKey) {
    return __.<A>start().groupCount(sideEffectKey);
  }

  public static <A> SocialTraversal<A, A> timeLimit(final long timeLimit) {
    return __.<A>start().timeLimit(timeLimit);
  }

  public static <A> SocialTraversal<A, A> tree(final String sideEffectKey) {
    return __.<A>start().tree(sideEffectKey);
  }

  public static <A, V, U> SocialTraversal<A, A> sack(final BiFunction<V, U, V> sackOperator) {
    return __.<A>start().sack(sackOperator);
  }

  public static <A> SocialTraversal<A, A> store(final String sideEffectKey) {
    return __.<A>start().store(sideEffectKey);
  }

  public static <A> SocialTraversal<A, A> property(final Object key, final Object value,
      final Object... keyValues) {
    return __.<A>start().property(key,value,keyValues);
  }

  public static <A> SocialTraversal<A, A> property(final VertexProperty.Cardinality cardinality,
      final Object key, final Object value, final Object... keyValues) {
    return __.<A>start().property(cardinality,key,value,keyValues);
  }

  public static <A> SocialTraversal<A, A> property(final Map<Object, Object> value) {
    return __.<A>start().property(value);
  }

  public static <A, M, B> SocialTraversal<A, B> branch(final Function<Traverser<A>, M> function) {
    return __.<A>start().branch(function);
  }

  public static <A, M, B> SocialTraversal<A, B> branch(final Traversal<?, M> traversalFunction) {
    return __.<A>start().branch(traversalFunction);
  }

  public static <A, B> SocialTraversal<A, B> choose(final Predicate<A> choosePredicate,
      final Traversal<?, B> trueChoice, final Traversal<?, B> falseChoice) {
    return __.<A>start().choose(choosePredicate,trueChoice,falseChoice);
  }

  public static <A, B> SocialTraversal<A, B> choose(final Predicate<A> choosePredicate,
      final Traversal<?, B> trueChoice) {
    return __.<A>start().choose(choosePredicate,trueChoice);
  }

  public static <A, M, B> SocialTraversal<A, B> choose(final Function<A, M> choiceFunction) {
    return __.<A>start().choose(choiceFunction);
  }

  public static <A, M, B> SocialTraversal<A, B> choose(final Traversal<?, M> traversalFunction) {
    return __.<A>start().choose(traversalFunction);
  }

  public static <A, M, B> SocialTraversal<A, B> choose(final Traversal<?, M> traversalPredicate,
      final Traversal<?, B> trueChoice, final Traversal<?, B> falseChoice) {
    return __.<A>start().choose(traversalPredicate,trueChoice,falseChoice);
  }

  public static <A, M, B> SocialTraversal<A, B> choose(final Traversal<?, M> traversalPredicate,
      final Traversal<?, B> trueChoice) {
    return __.<A>start().choose(traversalPredicate,trueChoice);
  }

  public static <A> SocialTraversal<A, A> optional(final Traversal<?, A> optionalTraversal) {
    return __.<A>start().optional(optionalTraversal);
  }

  public static <A, B> SocialTraversal<A, B> union(final Traversal<?, B>... traversals) {
    return __.<A>start().union(traversals);
  }

  public static <A, B> SocialTraversal<A, B> coalesce(final Traversal<?, B>... traversals) {
    return __.<A>start().coalesce(traversals);
  }

  public static <A> SocialTraversal<A, A> repeat(final Traversal<?, A> traversal) {
    return __.<A>start().repeat(traversal);
  }

  public static <A> SocialTraversal<A, A> repeat(final String loopName,
      final Traversal<?, A> traversal) {
    return __.<A>start().repeat(loopName,traversal);
  }

  public static <A> SocialTraversal<A, A> emit(final Traversal<?, ?> emitTraversal) {
    return __.<A>start().emit(emitTraversal);
  }

  public static <A> SocialTraversal<A, A> emit(final Predicate<Traverser<A>> emitPredicate) {
    return __.<A>start().emit(emitPredicate);
  }

  public static <A> SocialTraversal<A, A> until(final Traversal<?, ?> untilTraversal) {
    return __.<A>start().until(untilTraversal);
  }

  public static <A> SocialTraversal<A, A> until(final Predicate<Traverser<A>> untilPredicate) {
    return __.<A>start().until(untilPredicate);
  }

  public static <A> SocialTraversal<A, A> times(final int maxLoops) {
    return __.<A>start().times(maxLoops);
  }

  public static <A> SocialTraversal<A, A> emit() {
    return __.<A>start().emit();
  }

  public static <A, B> SocialTraversal<A, B> local(final Traversal<?, B> localTraversal) {
    return __.<A>start().local(localTraversal);
  }

  public static <A> SocialTraversal<A, A> as(final String label, final String... labels) {
    return __.<A>start().as(label,labels);
  }

  public static <A> SocialTraversal<A, A> barrier() {
    return __.<A>start().barrier();
  }

  public static <A> SocialTraversal<A, A> barrier(final int maxBarrierSize) {
    return __.<A>start().barrier(maxBarrierSize);
  }

  public static <A> SocialTraversal<A, A> barrier(
      final Consumer<TraverserSet<Object>> barrierConsumer) {
    return __.<A>start().barrier(barrierConsumer);
  }

  public static <A, B> SocialTraversal<A, B> index() {
    return __.<A>start().index();
  }

  public static <A, B> SocialTraversal<A, Element> element() {
    return __.<A>start().element();
  }

  public static <A, B> SocialTraversal<A, B> call(final String service) {
    return __.<A>start().call(service);
  }

  public static <A, B> SocialTraversal<A, B> call(final String service, final Map params) {
    return __.<A>start().call(service,params);
  }

  public static <A, B> SocialTraversal<A, B> call(final String service,
      final Traversal<?, Map<?, ?>> childTraversal) {
    return __.<A>start().call(service,childTraversal);
  }

  public static <A, B> SocialTraversal<A, B> call(final String service, final Map params,
      final Traversal<?, Map<?, ?>> childTraversal) {
    return __.<A>start().call(service,params,childTraversal);
  }
}
