/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the MiicSafeguardGoodAdd service. Represents a row in the &quot;nbp_miic_safeguard_good&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MiicSafeguardGoodAddModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.miic.application.form.services.model.impl.MiicSafeguardGoodAddImpl"
)
@ProviderType
public interface MiicSafeguardGoodAdd
	extends MiicSafeguardGoodAddModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.miic.application.form.services.model.impl.MiicSafeguardGoodAddImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MiicSafeguardGoodAdd, Long>
		MIIC_SAFEGUARD_GOOD_ADD_ID_ACCESSOR =
			new Accessor<MiicSafeguardGoodAdd, Long>() {

				@Override
				public Long get(MiicSafeguardGoodAdd miicSafeguardGoodAdd) {
					return miicSafeguardGoodAdd.getMiicSafeguardGoodAddId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MiicSafeguardGoodAdd> getTypeClass() {
					return MiicSafeguardGoodAdd.class;
				}

			};

}