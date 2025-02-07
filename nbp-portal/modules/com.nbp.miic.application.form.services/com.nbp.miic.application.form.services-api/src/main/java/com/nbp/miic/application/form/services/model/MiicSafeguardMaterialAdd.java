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
 * The extended model interface for the MiicSafeguardMaterialAdd service. Represents a row in the &quot;nbp_miic_safeguard_material&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MiicSafeguardMaterialAddModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.miic.application.form.services.model.impl.MiicSafeguardMaterialAddImpl"
)
@ProviderType
public interface MiicSafeguardMaterialAdd
	extends MiicSafeguardMaterialAddModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.miic.application.form.services.model.impl.MiicSafeguardMaterialAddImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MiicSafeguardMaterialAdd, Long>
		MIIC_SAFEGUARD_MATERIAL_ADD_ID_ACCESSOR =
			new Accessor<MiicSafeguardMaterialAdd, Long>() {

				@Override
				public Long get(
					MiicSafeguardMaterialAdd miicSafeguardMaterialAdd) {

					return miicSafeguardMaterialAdd.
						getMiicSafeguardMaterialAddId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MiicSafeguardMaterialAdd> getTypeClass() {
					return MiicSafeguardMaterialAdd.class;
				}

			};

}