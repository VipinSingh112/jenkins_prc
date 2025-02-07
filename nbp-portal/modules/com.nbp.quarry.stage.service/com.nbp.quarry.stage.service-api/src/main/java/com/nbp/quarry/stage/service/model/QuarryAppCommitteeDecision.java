/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the QuarryAppCommitteeDecision service. Represents a row in the &quot;nbp_quarry_comm_decision&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryAppCommitteeDecisionModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.quarry.stage.service.model.impl.QuarryAppCommitteeDecisionImpl"
)
@ProviderType
public interface QuarryAppCommitteeDecision
	extends PersistedModel, QuarryAppCommitteeDecisionModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.quarry.stage.service.model.impl.QuarryAppCommitteeDecisionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<QuarryAppCommitteeDecision, Long>
		QUARRY_APP_COMMITTEE_DECISION_ID_ACCESSOR =
			new Accessor<QuarryAppCommitteeDecision, Long>() {

				@Override
				public Long get(
					QuarryAppCommitteeDecision quarryAppCommitteeDecision) {

					return quarryAppCommitteeDecision.
						getQuarryAppCommitteeDecisionId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<QuarryAppCommitteeDecision> getTypeClass() {
					return QuarryAppCommitteeDecision.class;
				}

			};

}