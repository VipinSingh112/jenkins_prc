/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CreativeCompanyDetailsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDetailsLocalService
 * @generated
 */
public class CreativeCompanyDetailsLocalServiceWrapper
	implements CreativeCompanyDetailsLocalService,
			   ServiceWrapper<CreativeCompanyDetailsLocalService> {

	public CreativeCompanyDetailsLocalServiceWrapper() {
		this(null);
	}

	public CreativeCompanyDetailsLocalServiceWrapper(
		CreativeCompanyDetailsLocalService creativeCompanyDetailsLocalService) {

		_creativeCompanyDetailsLocalService =
			creativeCompanyDetailsLocalService;
	}

	/**
	 * Adds the creative company details to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyDetails the creative company details
	 * @return the creative company details that was added
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.CreativeCompanyDetails
			addCreativeCompanyDetails(
				com.nbp.creative.application.form.service.model.
					CreativeCompanyDetails creativeCompanyDetails) {

		return _creativeCompanyDetailsLocalService.addCreativeCompanyDetails(
			creativeCompanyDetails);
	}

	/**
	 * Creates a new creative company details with the primary key. Does not add the creative company details to the database.
	 *
	 * @param creativeCompanyDetailsId the primary key for the new creative company details
	 * @return the new creative company details
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.CreativeCompanyDetails
			createCreativeCompanyDetails(long creativeCompanyDetailsId) {

		return _creativeCompanyDetailsLocalService.createCreativeCompanyDetails(
			creativeCompanyDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyDetailsLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the creative company details from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyDetails the creative company details
	 * @return the creative company details that was removed
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.CreativeCompanyDetails
			deleteCreativeCompanyDetails(
				com.nbp.creative.application.form.service.model.
					CreativeCompanyDetails creativeCompanyDetails) {

		return _creativeCompanyDetailsLocalService.deleteCreativeCompanyDetails(
			creativeCompanyDetails);
	}

	/**
	 * Deletes the creative company details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyDetailsId the primary key of the creative company details
	 * @return the creative company details that was removed
	 * @throws PortalException if a creative company details with the primary key could not be found
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.CreativeCompanyDetails
				deleteCreativeCompanyDetails(long creativeCompanyDetailsId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyDetailsLocalService.deleteCreativeCompanyDetails(
			creativeCompanyDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyDetailsLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _creativeCompanyDetailsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _creativeCompanyDetailsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _creativeCompanyDetailsLocalService.dynamicQuery();
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

		return _creativeCompanyDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDetailsModelImpl</code>.
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

		return _creativeCompanyDetailsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDetailsModelImpl</code>.
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

		return _creativeCompanyDetailsLocalService.dynamicQuery(
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

		return _creativeCompanyDetailsLocalService.dynamicQueryCount(
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

		return _creativeCompanyDetailsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.creative.application.form.service.model.CreativeCompanyDetails
			fetchBygetCreativeById(long creativeApplicationId) {

		return _creativeCompanyDetailsLocalService.fetchBygetCreativeById(
			creativeApplicationId);
	}

	@Override
	public
		com.nbp.creative.application.form.service.model.CreativeCompanyDetails
			fetchCreativeCompanyDetails(long creativeCompanyDetailsId) {

		return _creativeCompanyDetailsLocalService.fetchCreativeCompanyDetails(
			creativeCompanyDetailsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _creativeCompanyDetailsLocalService.getActionableDynamicQuery();
	}

	@Override
	public
		com.nbp.creative.application.form.service.model.CreativeCompanyDetails
			getCreativeById(long creativeApplicationId) {

		return _creativeCompanyDetailsLocalService.getCreativeById(
			creativeApplicationId);
	}

	/**
	 * Returns the creative company details with the primary key.
	 *
	 * @param creativeCompanyDetailsId the primary key of the creative company details
	 * @return the creative company details
	 * @throws PortalException if a creative company details with the primary key could not be found
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.CreativeCompanyDetails
				getCreativeCompanyDetails(long creativeCompanyDetailsId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyDetailsLocalService.getCreativeCompanyDetails(
			creativeCompanyDetailsId);
	}

	/**
	 * Returns a range of all the creative company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company detailses
	 * @param end the upper bound of the range of creative company detailses (not inclusive)
	 * @return the range of creative company detailses
	 */
	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.CreativeCompanyDetails>
			getCreativeCompanyDetailses(int start, int end) {

		return _creativeCompanyDetailsLocalService.getCreativeCompanyDetailses(
			start, end);
	}

	/**
	 * Returns the number of creative company detailses.
	 *
	 * @return the number of creative company detailses
	 */
	@Override
	public int getCreativeCompanyDetailsesCount() {
		return _creativeCompanyDetailsLocalService.
			getCreativeCompanyDetailsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _creativeCompanyDetailsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeCompanyDetailsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeCompanyDetailsLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the creative company details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyDetails the creative company details
	 * @return the creative company details that was updated
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.CreativeCompanyDetails
			updateCreativeCompanyDetails(
				com.nbp.creative.application.form.service.model.
					CreativeCompanyDetails creativeCompanyDetails) {

		return _creativeCompanyDetailsLocalService.updateCreativeCompanyDetails(
			creativeCompanyDetails);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _creativeCompanyDetailsLocalService.getBasePersistence();
	}

	@Override
	public CreativeCompanyDetailsLocalService getWrappedService() {
		return _creativeCompanyDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		CreativeCompanyDetailsLocalService creativeCompanyDetailsLocalService) {

		_creativeCompanyDetailsLocalService =
			creativeCompanyDetailsLocalService;
	}

	private CreativeCompanyDetailsLocalService
		_creativeCompanyDetailsLocalService;

}