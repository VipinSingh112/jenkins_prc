/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the PharmaCancellationForm service. Represents a row in the &quot;nbp_pharma_cancel&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaCancellationFormModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.pharmaceutical.application.form.service.model.impl.PharmaCancellationFormImpl"
)
@ProviderType
public interface PharmaCancellationForm
	extends PersistedModel, PharmaCancellationFormModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaCancellationFormImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<PharmaCancellationForm, Long>
		PHARMA_CANCELLATION_FORM_ID_ACCESSOR =
			new Accessor<PharmaCancellationForm, Long>() {

				@Override
				public Long get(PharmaCancellationForm pharmaCancellationForm) {
					return pharmaCancellationForm.getPharmaCancellationFormId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<PharmaCancellationForm> getTypeClass() {
					return PharmaCancellationForm.class;
				}

			};

}