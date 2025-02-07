/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the JtbAddListDriverInfo service. Represents a row in the &quot;nbp_jtb_list_driver&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddListDriverInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.jtb.application.form.service.model.impl.JtbAddListDriverInfoImpl"
)
@ProviderType
public interface JtbAddListDriverInfo
	extends JtbAddListDriverInfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.jtb.application.form.service.model.impl.JtbAddListDriverInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<JtbAddListDriverInfo, Long>
		JTB_ADD_LIST_DRIVER_INFO_ID_ACCESSOR =
			new Accessor<JtbAddListDriverInfo, Long>() {

				@Override
				public Long get(JtbAddListDriverInfo jtbAddListDriverInfo) {
					return jtbAddListDriverInfo.getJtbAddListDriverInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<JtbAddListDriverInfo> getTypeClass() {
					return JtbAddListDriverInfo.class;
				}

			};

}