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
 * The extended model interface for the AddInsApplicationInfo service. Represents a row in the &quot;nbp_janaac_add_ins_appli_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AddInsApplicationInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AddInsApplicationInfoImpl"
)
@ProviderType
public interface AddInsApplicationInfo
	extends AddInsApplicationInfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AddInsApplicationInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AddInsApplicationInfo, Long>
		ADD_INS_APPLICATION_INFO_ID_ACCESSOR =
			new Accessor<AddInsApplicationInfo, Long>() {

				@Override
				public Long get(AddInsApplicationInfo addInsApplicationInfo) {
					return addInsApplicationInfo.getAddInsApplicationInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AddInsApplicationInfo> getTypeClass() {
					return AddInsApplicationInfo.class;
				}

			};

}