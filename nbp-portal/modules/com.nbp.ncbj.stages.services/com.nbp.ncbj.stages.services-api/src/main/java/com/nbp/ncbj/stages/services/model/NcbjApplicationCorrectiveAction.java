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
 * The extended model interface for the NcbjApplicationCorrectiveAction service. Represents a row in the &quot;nbp_ncbj_corrective_act&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicationCorrectiveActionModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ncbj.stages.services.model.impl.NcbjApplicationCorrectiveActionImpl"
)
@ProviderType
public interface NcbjApplicationCorrectiveAction
	extends NcbjApplicationCorrectiveActionModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationCorrectiveActionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<NcbjApplicationCorrectiveAction, Long>
		NCBJ_APP_CORR_ACTION_ID_ACCESSOR =
			new Accessor<NcbjApplicationCorrectiveAction, Long>() {

				@Override
				public Long get(
					NcbjApplicationCorrectiveAction
						ncbjApplicationCorrectiveAction) {

					return ncbjApplicationCorrectiveAction.
						getNcbjAppCorrActionId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<NcbjApplicationCorrectiveAction> getTypeClass() {
					return NcbjApplicationCorrectiveAction.class;
				}

			};

}