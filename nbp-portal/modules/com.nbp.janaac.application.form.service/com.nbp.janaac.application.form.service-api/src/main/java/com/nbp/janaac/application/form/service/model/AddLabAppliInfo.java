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
 * The extended model interface for the AddLabAppliInfo service. Represents a row in the &quot;nbp_janaac_add_lab_aapli_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabAppliInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AddLabAppliInfoImpl"
)
@ProviderType
public interface AddLabAppliInfo extends AddLabAppliInfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AddLabAppliInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AddLabAppliInfo, Long>
		ADD_LAB_APPLI_INFO_ID_ACCESSOR = new Accessor<AddLabAppliInfo, Long>() {

			@Override
			public Long get(AddLabAppliInfo addLabAppliInfo) {
				return addLabAppliInfo.getAddLabAppliInfoId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AddLabAppliInfo> getTypeClass() {
				return AddLabAppliInfo.class;
			}

		};

}