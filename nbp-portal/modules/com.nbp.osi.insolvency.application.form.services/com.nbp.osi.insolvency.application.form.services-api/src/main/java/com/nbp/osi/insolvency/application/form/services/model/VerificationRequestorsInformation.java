/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the VerificationRequestorsInformation service. Represents a row in the &quot;nbp_osi_ver_request_detail&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see VerificationRequestorsInformationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.insolvency.application.form.services.model.impl.VerificationRequestorsInformationImpl"
)
@ProviderType
public interface VerificationRequestorsInformation
	extends PersistedModel, VerificationRequestorsInformationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.insolvency.application.form.services.model.impl.VerificationRequestorsInformationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<VerificationRequestorsInformation, Long>
		REQUESTOR_INFORMATION_ID_ACCESSOR =
			new Accessor<VerificationRequestorsInformation, Long>() {

				@Override
				public Long get(
					VerificationRequestorsInformation
						verificationRequestorsInformation) {

					return verificationRequestorsInformation.
						getRequestorInformationId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<VerificationRequestorsInformation> getTypeClass() {
					return VerificationRequestorsInformation.class;
				}

			};
	public static final Accessor<VerificationRequestorsInformation, Long>
		OSI_INSOLVENCY_ID_ACCESSOR =
			new Accessor<VerificationRequestorsInformation, Long>() {

				@Override
				public Long get(
					VerificationRequestorsInformation
						verificationRequestorsInformation) {

					return verificationRequestorsInformation.
						getOsiInsolvencyId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<VerificationRequestorsInformation> getTypeClass() {
					return VerificationRequestorsInformation.class;
				}

			};

}