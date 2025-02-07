/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the ExplosiveCommisionDecision service. Represents a row in the &quot;nbp_explosive_commision_decis&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveCommisionDecisionModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.explosives.competency.stages.service.model.impl.ExplosiveCommisionDecisionImpl"
)
@ProviderType
public interface ExplosiveCommisionDecision
	extends ExplosiveCommisionDecisionModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveCommisionDecisionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ExplosiveCommisionDecision, Long>
		COMMISIONDEC_ID_ACCESSOR =
			new Accessor<ExplosiveCommisionDecision, Long>() {

				@Override
				public Long get(
					ExplosiveCommisionDecision explosiveCommisionDecision) {

					return explosiveCommisionDecision.getCommisiondecId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<ExplosiveCommisionDecision> getTypeClass() {
					return ExplosiveCommisionDecision.class;
				}

			};

}