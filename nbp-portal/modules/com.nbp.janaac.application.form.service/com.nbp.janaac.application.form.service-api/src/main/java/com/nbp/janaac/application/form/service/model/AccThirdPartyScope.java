/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AccThirdPartyScope service. Represents a row in the &quot;nbp_janaac_acc_third_scope&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AccThirdPartyScopeModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AccThirdPartyScopeImpl"
)
@ProviderType
public interface AccThirdPartyScope
	extends AccThirdPartyScopeModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AccThirdPartyScopeImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AccThirdPartyScope, Long>
		ACC_THIRD_PARTY_SCOPE_ID_ACCESSOR =
			new Accessor<AccThirdPartyScope, Long>() {

				@Override
				public Long get(AccThirdPartyScope accThirdPartyScope) {
					return accThirdPartyScope.getAccThirdPartyScopeId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AccThirdPartyScope> getTypeClass() {
					return AccThirdPartyScope.class;
				}

			};

}