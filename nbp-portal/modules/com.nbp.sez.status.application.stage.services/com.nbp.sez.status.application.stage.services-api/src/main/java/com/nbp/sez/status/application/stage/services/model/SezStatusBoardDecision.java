/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the SezStatusBoardDecision service. Represents a row in the &quot;nbp_sez_status_board_deci&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusBoardDecisionModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.stage.services.model.impl.SezStatusBoardDecisionImpl"
)
@ProviderType
public interface SezStatusBoardDecision
	extends PersistedModel, SezStatusBoardDecisionModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusBoardDecisionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezStatusBoardDecision, Long>
		SEZ_STATUS_BOARD_ID_ACCESSOR =
			new Accessor<SezStatusBoardDecision, Long>() {

				@Override
				public Long get(SezStatusBoardDecision sezStatusBoardDecision) {
					return sezStatusBoardDecision.getSezStatusBoardId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezStatusBoardDecision> getTypeClass() {
					return SezStatusBoardDecision.class;
				}

			};

}