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

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VerificationRequestorsInformationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VerificationRequestorsInformationLocalService
 * @generated
 */
public class VerificationRequestorsInformationLocalServiceWrapper
	implements ServiceWrapper<VerificationRequestorsInformationLocalService>,
			   VerificationRequestorsInformationLocalService {

	public VerificationRequestorsInformationLocalServiceWrapper() {
		this(null);
	}

	public VerificationRequestorsInformationLocalServiceWrapper(
		VerificationRequestorsInformationLocalService
			verificationRequestorsInformationLocalService) {

		_verificationRequestorsInformationLocalService =
			verificationRequestorsInformationLocalService;
	}

	/**
	 * Adds the verification requestors information to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VerificationRequestorsInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param verificationRequestorsInformation the verification requestors information
	 * @return the verification requestors information that was added
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationRequestorsInformation addVerificationRequestorsInformation(
			com.nbp.osi.insolvency.application.form.services.model.
				VerificationRequestorsInformation
					verificationRequestorsInformation) {

		return _verificationRequestorsInformationLocalService.
			addVerificationRequestorsInformation(
				verificationRequestorsInformation);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _verificationRequestorsInformationLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new verification requestors information with the primary key. Does not add the verification requestors information to the database.
	 *
	 * @param verificationRequestorsInformationPK the primary key for the new verification requestors information
	 * @return the new verification requestors information
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationRequestorsInformation
			createVerificationRequestorsInformation(
				com.nbp.osi.insolvency.application.form.services.service.
					persistence.VerificationRequestorsInformationPK
						verificationRequestorsInformationPK) {

		return _verificationRequestorsInformationLocalService.
			createVerificationRequestorsInformation(
				verificationRequestorsInformationPK);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _verificationRequestorsInformationLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the verification requestors information from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VerificationRequestorsInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param verificationRequestorsInformation the verification requestors information
	 * @return the verification requestors information that was removed
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationRequestorsInformation
			deleteVerificationRequestorsInformation(
				com.nbp.osi.insolvency.application.form.services.model.
					VerificationRequestorsInformation
						verificationRequestorsInformation) {

		return _verificationRequestorsInformationLocalService.
			deleteVerificationRequestorsInformation(
				verificationRequestorsInformation);
	}

	/**
	 * Deletes the verification requestors information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VerificationRequestorsInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param verificationRequestorsInformationPK the primary key of the verification requestors information
	 * @return the verification requestors information that was removed
	 * @throws PortalException if a verification requestors information with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationRequestorsInformation
				deleteVerificationRequestorsInformation(
					com.nbp.osi.insolvency.application.form.services.service.
						persistence.VerificationRequestorsInformationPK
							verificationRequestorsInformationPK)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _verificationRequestorsInformationLocalService.
			deleteVerificationRequestorsInformation(
				verificationRequestorsInformationPK);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _verificationRequestorsInformationLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _verificationRequestorsInformationLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _verificationRequestorsInformationLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _verificationRequestorsInformationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.VerificationRequestorsInformationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _verificationRequestorsInformationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.VerificationRequestorsInformationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _verificationRequestorsInformationLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _verificationRequestorsInformationLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _verificationRequestorsInformationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationRequestorsInformation
			fetchVerificationRequestorsInformation(
				com.nbp.osi.insolvency.application.form.services.service.
					persistence.VerificationRequestorsInformationPK
						verificationRequestorsInformationPK) {

		return _verificationRequestorsInformationLocalService.
			fetchVerificationRequestorsInformation(
				verificationRequestorsInformationPK);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _verificationRequestorsInformationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _verificationRequestorsInformationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _verificationRequestorsInformationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _verificationRequestorsInformationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the verification requestors information with the primary key.
	 *
	 * @param verificationRequestorsInformationPK the primary key of the verification requestors information
	 * @return the verification requestors information
	 * @throws PortalException if a verification requestors information with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationRequestorsInformation getVerificationRequestorsInformation(
				com.nbp.osi.insolvency.application.form.services.service.
					persistence.VerificationRequestorsInformationPK
						verificationRequestorsInformationPK)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _verificationRequestorsInformationLocalService.
			getVerificationRequestorsInformation(
				verificationRequestorsInformationPK);
	}

	/**
	 * Returns a range of all the verification requestors informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.VerificationRequestorsInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors informations
	 * @param end the upper bound of the range of verification requestors informations (not inclusive)
	 * @return the range of verification requestors informations
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			VerificationRequestorsInformation>
				getVerificationRequestorsInformations(int start, int end) {

		return _verificationRequestorsInformationLocalService.
			getVerificationRequestorsInformations(start, end);
	}

	/**
	 * Returns the number of verification requestors informations.
	 *
	 * @return the number of verification requestors informations
	 */
	@Override
	public int getVerificationRequestorsInformationsCount() {
		return _verificationRequestorsInformationLocalService.
			getVerificationRequestorsInformationsCount();
	}

	/**
	 * Updates the verification requestors information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VerificationRequestorsInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param verificationRequestorsInformation the verification requestors information
	 * @return the verification requestors information that was updated
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		VerificationRequestorsInformation
			updateVerificationRequestorsInformation(
				com.nbp.osi.insolvency.application.form.services.model.
					VerificationRequestorsInformation
						verificationRequestorsInformation) {

		return _verificationRequestorsInformationLocalService.
			updateVerificationRequestorsInformation(
				verificationRequestorsInformation);
	}

	@Override
	public VerificationRequestorsInformationLocalService getWrappedService() {
		return _verificationRequestorsInformationLocalService;
	}

	@Override
	public void setWrappedService(
		VerificationRequestorsInformationLocalService
			verificationRequestorsInformationLocalService) {

		_verificationRequestorsInformationLocalService =
			verificationRequestorsInformationLocalService;
	}

	private VerificationRequestorsInformationLocalService
		_verificationRequestorsInformationLocalService;

}