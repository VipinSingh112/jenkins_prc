/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CreativeCompanyGeneralInformationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyGeneralInformationLocalService
 * @generated
 */
public class CreativeCompanyGeneralInformationLocalServiceWrapper
	implements CreativeCompanyGeneralInformationLocalService,
			   ServiceWrapper<CreativeCompanyGeneralInformationLocalService> {

	public CreativeCompanyGeneralInformationLocalServiceWrapper() {
		this(null);
	}

	public CreativeCompanyGeneralInformationLocalServiceWrapper(
		CreativeCompanyGeneralInformationLocalService
			creativeCompanyGeneralInformationLocalService) {

		_creativeCompanyGeneralInformationLocalService =
			creativeCompanyGeneralInformationLocalService;
	}

	/**
	 * Adds the creative company general information to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyGeneralInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyGeneralInformation the creative company general information
	 * @return the creative company general information that was added
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyGeneralInformation addCreativeCompanyGeneralInformation(
			com.nbp.creative.application.form.service.model.
				CreativeCompanyGeneralInformation
					creativeCompanyGeneralInformation) {

		return _creativeCompanyGeneralInformationLocalService.
			addCreativeCompanyGeneralInformation(
				creativeCompanyGeneralInformation);
	}

	/**
	 * Creates a new creative company general information with the primary key. Does not add the creative company general information to the database.
	 *
	 * @param creativeCompanyGeneralInfoId the primary key for the new creative company general information
	 * @return the new creative company general information
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyGeneralInformation
			createCreativeCompanyGeneralInformation(
				long creativeCompanyGeneralInfoId) {

		return _creativeCompanyGeneralInformationLocalService.
			createCreativeCompanyGeneralInformation(
				creativeCompanyGeneralInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyGeneralInformationLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the creative company general information from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyGeneralInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyGeneralInformation the creative company general information
	 * @return the creative company general information that was removed
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyGeneralInformation
			deleteCreativeCompanyGeneralInformation(
				com.nbp.creative.application.form.service.model.
					CreativeCompanyGeneralInformation
						creativeCompanyGeneralInformation) {

		return _creativeCompanyGeneralInformationLocalService.
			deleteCreativeCompanyGeneralInformation(
				creativeCompanyGeneralInformation);
	}

	/**
	 * Deletes the creative company general information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyGeneralInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyGeneralInfoId the primary key of the creative company general information
	 * @return the creative company general information that was removed
	 * @throws PortalException if a creative company general information with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyGeneralInformation
				deleteCreativeCompanyGeneralInformation(
					long creativeCompanyGeneralInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyGeneralInformationLocalService.
			deleteCreativeCompanyGeneralInformation(
				creativeCompanyGeneralInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyGeneralInformationLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _creativeCompanyGeneralInformationLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _creativeCompanyGeneralInformationLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _creativeCompanyGeneralInformationLocalService.dynamicQuery();
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

		return _creativeCompanyGeneralInformationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyGeneralInformationModelImpl</code>.
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

		return _creativeCompanyGeneralInformationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyGeneralInformationModelImpl</code>.
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

		return _creativeCompanyGeneralInformationLocalService.dynamicQuery(
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

		return _creativeCompanyGeneralInformationLocalService.dynamicQueryCount(
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

		return _creativeCompanyGeneralInformationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyGeneralInformation fetcbygetCreativeById(
			long creativeApplicationId) {

		return _creativeCompanyGeneralInformationLocalService.
			fetcbygetCreativeById(creativeApplicationId);
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyGeneralInformation
			fetchCreativeCompanyGeneralInformation(
				long creativeCompanyGeneralInfoId) {

		return _creativeCompanyGeneralInformationLocalService.
			fetchCreativeCompanyGeneralInformation(
				creativeCompanyGeneralInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _creativeCompanyGeneralInformationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyGeneralInformation getCreativeById(
			long creativeApplicationId) {

		return _creativeCompanyGeneralInformationLocalService.getCreativeById(
			creativeApplicationId);
	}

	/**
	 * Returns the creative company general information with the primary key.
	 *
	 * @param creativeCompanyGeneralInfoId the primary key of the creative company general information
	 * @return the creative company general information
	 * @throws PortalException if a creative company general information with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyGeneralInformation getCreativeCompanyGeneralInformation(
				long creativeCompanyGeneralInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyGeneralInformationLocalService.
			getCreativeCompanyGeneralInformation(creativeCompanyGeneralInfoId);
	}

	/**
	 * Returns a range of all the creative company general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company general informations
	 * @param end the upper bound of the range of creative company general informations (not inclusive)
	 * @return the range of creative company general informations
	 */
	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.
			CreativeCompanyGeneralInformation>
				getCreativeCompanyGeneralInformations(int start, int end) {

		return _creativeCompanyGeneralInformationLocalService.
			getCreativeCompanyGeneralInformations(start, end);
	}

	/**
	 * Returns the number of creative company general informations.
	 *
	 * @return the number of creative company general informations
	 */
	@Override
	public int getCreativeCompanyGeneralInformationsCount() {
		return _creativeCompanyGeneralInformationLocalService.
			getCreativeCompanyGeneralInformationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _creativeCompanyGeneralInformationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeCompanyGeneralInformationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyGeneralInformationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the creative company general information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyGeneralInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyGeneralInformation the creative company general information
	 * @return the creative company general information that was updated
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyGeneralInformation
			updateCreativeCompanyGeneralInformation(
				com.nbp.creative.application.form.service.model.
					CreativeCompanyGeneralInformation
						creativeCompanyGeneralInformation) {

		return _creativeCompanyGeneralInformationLocalService.
			updateCreativeCompanyGeneralInformation(
				creativeCompanyGeneralInformation);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _creativeCompanyGeneralInformationLocalService.
			getBasePersistence();
	}

	@Override
	public CreativeCompanyGeneralInformationLocalService getWrappedService() {
		return _creativeCompanyGeneralInformationLocalService;
	}

	@Override
	public void setWrappedService(
		CreativeCompanyGeneralInformationLocalService
			creativeCompanyGeneralInformationLocalService) {

		_creativeCompanyGeneralInformationLocalService =
			creativeCompanyGeneralInformationLocalService;
	}

	private CreativeCompanyGeneralInformationLocalService
		_creativeCompanyGeneralInformationLocalService;

}