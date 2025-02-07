/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the FullLicenseCommitteeDecision service. Represents a row in the &quot;nbp_cannabis_comm_decision&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FullLicenseCommitteeDecisionModel
 * @generated
 */
@ImplementationClassName(
	"com.npm.cannabis.application.stages.services.model.impl.FullLicenseCommitteeDecisionImpl"
)
@ProviderType
public interface FullLicenseCommitteeDecision
	extends FullLicenseCommitteeDecisionModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.npm.cannabis.application.stages.services.model.impl.FullLicenseCommitteeDecisionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FullLicenseCommitteeDecision, Long>
		FULL_LICENSE_COMMITTEE_DECISION_ID_ACCESSOR =
			new Accessor<FullLicenseCommitteeDecision, Long>() {

				@Override
				public Long get(
					FullLicenseCommitteeDecision fullLicenseCommitteeDecision) {

					return fullLicenseCommitteeDecision.
						getFullLicenseCommitteeDecisionId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<FullLicenseCommitteeDecision> getTypeClass() {
					return FullLicenseCommitteeDecision.class;
				}

			};

}