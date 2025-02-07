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
 * The extended model interface for the AccInsBodiesManageSys service. Represents a row in the &quot;nbp_janaac_acc_ins_body_manag&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesManageSysModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AccInsBodiesManageSysImpl"
)
@ProviderType
public interface AccInsBodiesManageSys
	extends AccInsBodiesManageSysModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesManageSysImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AccInsBodiesManageSys, Long>
		ACC_INS_BODIES_MANAGE_SYS_ID_ACCESSOR =
			new Accessor<AccInsBodiesManageSys, Long>() {

				@Override
				public Long get(AccInsBodiesManageSys accInsBodiesManageSys) {
					return accInsBodiesManageSys.getAccInsBodiesManageSysId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AccInsBodiesManageSys> getTypeClass() {
					return AccInsBodiesManageSys.class;
				}

			};

}