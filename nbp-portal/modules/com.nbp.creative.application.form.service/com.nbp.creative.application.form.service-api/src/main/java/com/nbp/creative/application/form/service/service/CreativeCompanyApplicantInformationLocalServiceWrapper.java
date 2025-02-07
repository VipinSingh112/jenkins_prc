/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CreativeCompanyApplicantInformationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyApplicantInformationLocalService
 * @generated
 */
public class CreativeCompanyApplicantInformationLocalServiceWrapper
	implements CreativeCompanyApplicantInformationLocalService,
			   ServiceWrapper<CreativeCompanyApplicantInformationLocalService> {

	public CreativeCompanyApplicantInformationLocalServiceWrapper() {
		this(null);
	}

	public CreativeCompanyApplicantInformationLocalServiceWrapper(
		CreativeCompanyApplicantInformationLocalService
			creativeCompanyApplicantInformationLocalService) {

		_creativeCompanyApplicantInformationLocalService =
			creativeCompanyApplicantInformationLocalService;
	}

	/**
	 * Adds the creative company applicant information to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyApplicantInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyApplicantInformation the creative company applicant information
	 * @return the creative company applicant information that was added
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyApplicantInformation
			addCreativeCompanyApplicantInformation(
				com.nbp.creative.application.form.service.model.
					CreativeCompanyApplicantInformation
						creativeCompanyApplicantInformation) {

		return _creativeCompanyApplicantInformationLocalService.
			addCreativeCompanyApplicantInformation(
				creativeCompanyApplicantInformation);
	}

	/**
	 * Creates a new creative company applicant information with the primary key. Does not add the creative company applicant information to the database.
	 *
	 * @param creativeCompanyApplicantInfoId the primary key for the new creative company applicant information
	 * @return the new creative company applicant information
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyApplicantInformation
			createCreativeCompanyApplicantInformation(
				long creativeCompanyApplicantInfoId) {

		return _creativeCompanyApplicantInformationLocalService.
			createCreativeCompanyApplicantInformation(
				creativeCompanyApplicantInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyApplicantInformationLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the creative company applicant information from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyApplicantInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyApplicantInformation the creative company applicant information
	 * @return the creative company applicant information that was removed
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyApplicantInformation
			deleteCreativeCompanyApplicantInformation(
				com.nbp.creative.application.form.service.model.
					CreativeCompanyApplicantInformation
						creativeCompanyApplicantInformation) {

		return _creativeCompanyApplicantInformationLocalService.
			deleteCreativeCompanyApplicantInformation(
				creativeCompanyApplicantInformation);
	}

	/**
	 * Deletes the creative company applicant information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyApplicantInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyApplicantInfoId the primary key of the creative company applicant information
	 * @return the creative company applicant information that was removed
	 * @throws PortalException if a creative company applicant information with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyApplicantInformation
				deleteCreativeCompanyApplicantInformation(
					long creativeCompanyApplicantInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyApplicantInformationLocalService.
			deleteCreativeCompanyApplicantInformation(
				creativeCompanyApplicantInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyApplicantInformationLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _creativeCompanyApplicantInformationLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _creativeCompanyApplicantInformationLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _creativeCompanyApplicantInformationLocalService.dynamicQuery();
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

		return _creativeCompanyApplicantInformationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyApplicantInformationModelImpl</code>.
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

		return _creativeCompanyApplicantInformationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyApplicantInformationModelImpl</code>.
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

		return _creativeCompanyApplicantInformationLocalService.dynamicQuery(
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

		return _creativeCompanyApplicantInformationLocalService.
			dynamicQueryCount(dynamicQuery);
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

		return _creativeCompanyApplicantInformationLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyApplicantInformation
			fetchCreativeCompanyApplicantInformation(
				long creativeCompanyApplicantInfoId) {

		return _creativeCompanyApplicantInformationLocalService.
			fetchCreativeCompanyApplicantInformation(
				creativeCompanyApplicantInfoId);
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyApplicantInformation findBygetCreativeById(
			long creativeApplicationId) {

		return _creativeCompanyApplicantInformationLocalService.
			findBygetCreativeById(creativeApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _creativeCompanyApplicantInformationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyApplicantInformation getCreativeById(
			long creativeApplicationId) {

		return _creativeCompanyApplicantInformationLocalService.getCreativeById(
			creativeApplicationId);
	}

	/**
	 * Returns the creative company applicant information with the primary key.
	 *
	 * @param creativeCompanyApplicantInfoId the primary key of the creative company applicant information
	 * @return the creative company applicant information
	 * @throws PortalException if a creative company applicant information with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyApplicantInformation
				getCreativeCompanyApplicantInformation(
					long creativeCompanyApplicantInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyApplicantInformationLocalService.
			getCreativeCompanyApplicantInformation(
				creativeCompanyApplicantInfoId);
	}

	/**
	 * Returns a range of all the creative company applicant informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyApplicantInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company applicant informations
	 * @param end the upper bound of the range of creative company applicant informations (not inclusive)
	 * @return the range of creative company applicant informations
	 */
	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.
			CreativeCompanyApplicantInformation>
				getCreativeCompanyApplicantInformations(int start, int end) {

		return _creativeCompanyApplicantInformationLocalService.
			getCreativeCompanyApplicantInformations(start, end);
	}

	/**
	 * Returns the number of creative company applicant informations.
	 *
	 * @return the number of creative company applicant informations
	 */
	@Override
	public int getCreativeCompanyApplicantInformationsCount() {
		return _creativeCompanyApplicantInformationLocalService.
			getCreativeCompanyApplicantInformationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _creativeCompanyApplicantInformationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeCompanyApplicantInformationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyApplicantInformationLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the creative company applicant information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyApplicantInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyApplicantInformation the creative company applicant information
	 * @return the creative company applicant information that was updated
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyApplicantInformation
			updateCreativeCompanyApplicantInformation(
				com.nbp.creative.application.form.service.model.
					CreativeCompanyApplicantInformation
						creativeCompanyApplicantInformation) {

		return _creativeCompanyApplicantInformationLocalService.
			updateCreativeCompanyApplicantInformation(
				creativeCompanyApplicantInformation);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _creativeCompanyApplicantInformationLocalService.
			getBasePersistence();
	}

	@Override
	public CreativeCompanyApplicantInformationLocalService getWrappedService() {
		return _creativeCompanyApplicantInformationLocalService;
	}

	@Override
	public void setWrappedService(
		CreativeCompanyApplicantInformationLocalService
			creativeCompanyApplicantInformationLocalService) {

		_creativeCompanyApplicantInformationLocalService =
			creativeCompanyApplicantInformationLocalService;
	}

	private CreativeCompanyApplicantInformationLocalService
		_creativeCompanyApplicantInformationLocalService;

}