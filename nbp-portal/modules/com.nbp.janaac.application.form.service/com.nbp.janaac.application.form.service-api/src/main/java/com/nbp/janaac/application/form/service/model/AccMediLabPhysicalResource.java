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
 * The extended model interface for the AccMediLabPhysicalResource service. Represents a row in the &quot;nbp_janaac_acc_medi_physical&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabPhysicalResourceModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AccMediLabPhysicalResourceImpl"
)
@ProviderType
public interface AccMediLabPhysicalResource
	extends AccMediLabPhysicalResourceModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabPhysicalResourceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AccMediLabPhysicalResource, Long>
		ACC_MEDI_LAB_PHYSICAL_RESOURCE_ID_ACCESSOR =
			new Accessor<AccMediLabPhysicalResource, Long>() {

				@Override
				public Long get(
					AccMediLabPhysicalResource accMediLabPhysicalResource) {

					return accMediLabPhysicalResource.
						getAccMediLabPhysicalResourceId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AccMediLabPhysicalResource> getTypeClass() {
					return AccMediLabPhysicalResource.class;
				}

			};

}