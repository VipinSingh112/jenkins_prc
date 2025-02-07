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
 * The extended model interface for the AccCerBodyScope service. Represents a row in the &quot;nbp_janaac_acc_cer_scope&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyScopeModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AccCerBodyScopeImpl"
)
@ProviderType
public interface AccCerBodyScope extends AccCerBodyScopeModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyScopeImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AccCerBodyScope, Long>
		ACC_CER_BODY_SCOPE_ID_ACCESSOR = new Accessor<AccCerBodyScope, Long>() {

			@Override
			public Long get(AccCerBodyScope accCerBodyScope) {
				return accCerBodyScope.getAccCerBodyScopeId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AccCerBodyScope> getTypeClass() {
				return AccCerBodyScope.class;
			}

		};

}