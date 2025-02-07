/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the MiicRecommendationsDecision service. Represents a row in the &quot;nbp_miic_recommen_decision&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MiicRecommendationsDecisionModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.miic.stages.service.model.impl.MiicRecommendationsDecisionImpl"
)
@ProviderType
public interface MiicRecommendationsDecision
	extends MiicRecommendationsDecisionModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.miic.stages.service.model.impl.MiicRecommendationsDecisionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MiicRecommendationsDecision, Long>
		MIIC_RECOMMENDATIONS_DECISION_ID_ACCESSOR =
			new Accessor<MiicRecommendationsDecision, Long>() {

				@Override
				public Long get(
					MiicRecommendationsDecision miicRecommendationsDecision) {

					return miicRecommendationsDecision.
						getMiicRecommendationsDecisionId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MiicRecommendationsDecision> getTypeClass() {
					return MiicRecommendationsDecision.class;
				}

			};

}