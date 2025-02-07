/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the NcbjNumOfEmpAdd service. Represents a row in the &quot;nbp_ncbj_num_of_emp&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjNumOfEmpAddModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ncbj.application.form.service.model.impl.NcbjNumOfEmpAddImpl"
)
@ProviderType
public interface NcbjNumOfEmpAdd extends NcbjNumOfEmpAddModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ncbj.application.form.service.model.impl.NcbjNumOfEmpAddImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<NcbjNumOfEmpAdd, Long>
		NCBJ_NUM_OF_EMP_ADD_ID_ACCESSOR =
			new Accessor<NcbjNumOfEmpAdd, Long>() {

				@Override
				public Long get(NcbjNumOfEmpAdd ncbjNumOfEmpAdd) {
					return ncbjNumOfEmpAdd.getNcbjNumOfEmpAddId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<NcbjNumOfEmpAdd> getTypeClass() {
					return NcbjNumOfEmpAdd.class;
				}

			};

}