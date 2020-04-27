package org.apache.flink.runtime.executiongraph;

import org.apache.flink.runtime.jobgraph.OperatorID;

import javax.annotation.Nullable;

import java.util.Optional;

public class OperatorIdPair {

	private final OperatorID operatorId;
	private final OperatorID alternativeOperatorId;

	public OperatorIdPair(OperatorID operatorId, @Nullable OperatorID alternativeOperatorId) {
		this.operatorId = operatorId;
		this.alternativeOperatorId = alternativeOperatorId;
	}

	public OperatorID getOperatorId() {
		return operatorId;
	}

	public Optional<OperatorID> getAlternativeOperatorId() {
		return Optional.ofNullable(alternativeOperatorId);
	}
}
