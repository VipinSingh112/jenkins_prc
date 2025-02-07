/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the NcbjAppBoardDecision service. Represents a row in the &quot;nbp_ncbj_board_decision&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjAppBoardDecisionModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ncbj.stages.services.model.impl.NcbjAppBoardDecisionImpl"
)
@ProviderType
public interface NcbjAppBoardDecision
	extends NcbjAppBoardDecisionModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ncbj.stages.services.model.impl.NcbjAppBoardDecisionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<NcbjAppBoardDecision, Long>
		NCBJ_APP_BOARD_DECISION_ID_ACCESSOR =
			new Accessor<NcbjAppBoardDecision, Long>() {

				@Override
				public Long get(NcbjAppBoardDecision ncbjAppBoardDecision) {
					return ncbjAppBoardDecision.getNcbjAppBoardDecisionId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<NcbjAppBoardDecision> getTypeClass() {
					return NcbjAppBoardDecision.class;
				}

			};

}