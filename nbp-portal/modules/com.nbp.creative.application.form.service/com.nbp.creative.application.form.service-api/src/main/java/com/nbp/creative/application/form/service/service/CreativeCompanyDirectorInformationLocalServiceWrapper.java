/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CreativeCompanyDirectorInformationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDirectorInformationLocalService
 * @generated
 */
public class CreativeCompanyDirectorInformationLocalServiceWrapper
	implements CreativeCompanyDirectorInformationLocalService,
			   ServiceWrapper<CreativeCompanyDirectorInformationLocalService> {

	public CreativeCompanyDirectorInformationLocalServiceWrapper() {
		this(null);
	}

	public CreativeCompanyDirectorInformationLocalServiceWrapper(
		CreativeCompanyDirectorInformationLocalService
			creativeCompanyDirectorInformationLocalService) {

		_creativeCompanyDirectorInformationLocalService =
			creativeCompanyDirectorInformationLocalService;
	}

	/**
	 * Adds the creative company director information to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDirectorInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyDirectorInformation the creative company director information
	 * @return the creative company director information that was added
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDirectorInformation
			addCreativeCompanyDirectorInformation(
				com.nbp.creative.application.form.service.model.
					CreativeCompanyDirectorInformation
						creativeCompanyDirectorInformation) {

		return _creativeCompanyDirectorInformationLocalService.
			addCreativeCompanyDirectorInformation(
				creativeCompanyDirectorInformation);
	}

	/**
	 * Creates a new creative company director information with the primary key. Does not add the creative company director information to the database.
	 *
	 * @param creativeComDirectorInfoId the primary key for the new creative company director information
	 * @return the new creative company director information
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDirectorInformation
			createCreativeCompanyDirectorInformation(
				long creativeComDirectorInfoId) {

		return _creativeCompanyDirectorInformationLocalService.
			createCreativeCompanyDirectorInformation(creativeComDirectorInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyDirectorInformationLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the creative company director information from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDirectorInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyDirectorInformation the creative company director information
	 * @return the creative company director information that was removed
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDirectorInformation
			deleteCreativeCompanyDirectorInformation(
				com.nbp.creative.application.form.service.model.
					CreativeCompanyDirectorInformation
						creativeCompanyDirectorInformation) {

		return _creativeCompanyDirectorInformationLocalService.
			deleteCreativeCompanyDirectorInformation(
				creativeCompanyDirectorInformation);
	}

	/**
	 * Deletes the creative company director information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDirectorInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeComDirectorInfoId the primary key of the creative company director information
	 * @return the creative company director information that was removed
	 * @throws PortalException if a creative company director information with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDirectorInformation
				deleteCreativeCompanyDirectorInformation(
					long creativeComDirectorInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyDirectorInformationLocalService.
			deleteCreativeCompanyDirectorInformation(creativeComDirectorInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyDirectorInformationLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _creativeCompanyDirectorInformationLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _creativeCompanyDirectorInformationLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _creativeCompanyDirectorInformationLocalService.dynamicQuery();
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

		return _creativeCompanyDirectorInformationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationModelImpl</code>.
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

		return _creativeCompanyDirectorInformationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationModelImpl</code>.
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

		return _creativeCompanyDirectorInformationLocalService.dynamicQuery(
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

		return _creativeCompanyDirectorInformationLocalService.
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

		return _creativeCompanyDirectorInformationLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDirectorInformation fetchBygetCreativeById(
			long creativeApplicationId) {

		return _creativeCompanyDirectorInformationLocalService.
			fetchBygetCreativeById(creativeApplicationId);
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDirectorInformation
			fetchCreativeCompanyDirectorInformation(
				long creativeComDirectorInfoId) {

		return _creativeCompanyDirectorInformationLocalService.
			fetchCreativeCompanyDirectorInformation(creativeComDirectorInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _creativeCompanyDirectorInformationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDirectorInformation getCreativeById(
			long creativeApplicationId) {

		return _creativeCompanyDirectorInformationLocalService.getCreativeById(
			creativeApplicationId);
	}

	/**
	 * Returns the creative company director information with the primary key.
	 *
	 * @param creativeComDirectorInfoId the primary key of the creative company director information
	 * @return the creative company director information
	 * @throws PortalException if a creative company director information with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDirectorInformation
				getCreativeCompanyDirectorInformation(
					long creativeComDirectorInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyDirectorInformationLocalService.
			getCreativeCompanyDirectorInformation(creativeComDirectorInfoId);
	}

	/**
	 * Returns a range of all the creative company director informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company director informations
	 * @param end the upper bound of the range of creative company director informations (not inclusive)
	 * @return the range of creative company director informations
	 */
	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.
			CreativeCompanyDirectorInformation>
				getCreativeCompanyDirectorInformations(int start, int end) {

		return _creativeCompanyDirectorInformationLocalService.
			getCreativeCompanyDirectorInformations(start, end);
	}

	/**
	 * Returns the number of creative company director informations.
	 *
	 * @return the number of creative company director informations
	 */
	@Override
	public int getCreativeCompanyDirectorInformationsCount() {
		return _creativeCompanyDirectorInformationLocalService.
			getCreativeCompanyDirectorInformationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _creativeCompanyDirectorInformationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeCompanyDirectorInformationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyDirectorInformationLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the creative company director information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDirectorInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyDirectorInformation the creative company director information
	 * @return the creative company director information that was updated
	 */
	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeCompanyDirectorInformation
			updateCreativeCompanyDirectorInformation(
				com.nbp.creative.application.form.service.model.
					CreativeCompanyDirectorInformation
						creativeCompanyDirectorInformation) {

		return _creativeCompanyDirectorInformationLocalService.
			updateCreativeCompanyDirectorInformation(
				creativeCompanyDirectorInformation);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _creativeCompanyDirectorInformationLocalService.
			getBasePersistence();
	}

	@Override
	public CreativeCompanyDirectorInformationLocalService getWrappedService() {
		return _creativeCompanyDirectorInformationLocalService;
	}

	@Override
	public void setWrappedService(
		CreativeCompanyDirectorInformationLocalService
			creativeCompanyDirectorInformationLocalService) {

		_creativeCompanyDirectorInformationLocalService =
			creativeCompanyDirectorInformationLocalService;
	}

	private CreativeCompanyDirectorInformationLocalService
		_creativeCompanyDirectorInformationLocalService;

}