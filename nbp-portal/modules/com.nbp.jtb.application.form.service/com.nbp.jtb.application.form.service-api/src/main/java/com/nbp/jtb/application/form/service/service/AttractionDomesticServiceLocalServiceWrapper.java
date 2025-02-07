/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AttractionDomesticServiceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionDomesticServiceLocalService
 * @generated
 */
public class AttractionDomesticServiceLocalServiceWrapper
	implements AttractionDomesticServiceLocalService,
			   ServiceWrapper<AttractionDomesticServiceLocalService> {

	public AttractionDomesticServiceLocalServiceWrapper() {
		this(null);
	}

	public AttractionDomesticServiceLocalServiceWrapper(
		AttractionDomesticServiceLocalService
			attractionDomesticServiceLocalService) {

		_attractionDomesticServiceLocalService =
			attractionDomesticServiceLocalService;
	}

	/**
	 * Adds the attraction domestic service to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionDomesticServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionDomesticService the attraction domestic service
	 * @return the attraction domestic service that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionDomesticService
		addAttractionDomesticService(
			com.nbp.jtb.application.form.service.model.AttractionDomesticService
				attractionDomesticService) {

		return _attractionDomesticServiceLocalService.
			addAttractionDomesticService(attractionDomesticService);
	}

	/**
	 * Creates a new attraction domestic service with the primary key. Does not add the attraction domestic service to the database.
	 *
	 * @param attractionDomesticServId the primary key for the new attraction domestic service
	 * @return the new attraction domestic service
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionDomesticService
		createAttractionDomesticService(long attractionDomesticServId) {

		return _attractionDomesticServiceLocalService.
			createAttractionDomesticService(attractionDomesticServId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionDomesticServiceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the attraction domestic service from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionDomesticServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionDomesticService the attraction domestic service
	 * @return the attraction domestic service that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionDomesticService
		deleteAttractionDomesticService(
			com.nbp.jtb.application.form.service.model.AttractionDomesticService
				attractionDomesticService) {

		return _attractionDomesticServiceLocalService.
			deleteAttractionDomesticService(attractionDomesticService);
	}

	/**
	 * Deletes the attraction domestic service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionDomesticServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionDomesticServId the primary key of the attraction domestic service
	 * @return the attraction domestic service that was removed
	 * @throws PortalException if a attraction domestic service with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionDomesticService
			deleteAttractionDomesticService(long attractionDomesticServId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionDomesticServiceLocalService.
			deleteAttractionDomesticService(attractionDomesticServId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionDomesticServiceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _attractionDomesticServiceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _attractionDomesticServiceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _attractionDomesticServiceLocalService.dynamicQuery();
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

		return _attractionDomesticServiceLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionDomesticServiceModelImpl</code>.
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

		return _attractionDomesticServiceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionDomesticServiceModelImpl</code>.
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

		return _attractionDomesticServiceLocalService.dynamicQuery(
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

		return _attractionDomesticServiceLocalService.dynamicQueryCount(
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

		return _attractionDomesticServiceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionDomesticService
		fetchAttractionDomesticService(long attractionDomesticServId) {

		return _attractionDomesticServiceLocalService.
			fetchAttractionDomesticService(attractionDomesticServId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _attractionDomesticServiceLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the attraction domestic service with the primary key.
	 *
	 * @param attractionDomesticServId the primary key of the attraction domestic service
	 * @return the attraction domestic service
	 * @throws PortalException if a attraction domestic service with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionDomesticService
			getAttractionDomesticService(long attractionDomesticServId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionDomesticServiceLocalService.
			getAttractionDomesticService(attractionDomesticServId);
	}

	/**
	 * Returns a range of all the attraction domestic services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionDomesticServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic services
	 * @param end the upper bound of the range of attraction domestic services (not inclusive)
	 * @return the range of attraction domestic services
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AttractionDomesticService>
			getAttractionDomesticServices(int start, int end) {

		return _attractionDomesticServiceLocalService.
			getAttractionDomesticServices(start, end);
	}

	/**
	 * Returns the number of attraction domestic services.
	 *
	 * @return the number of attraction domestic services
	 */
	@Override
	public int getAttractionDomesticServicesCount() {
		return _attractionDomesticServiceLocalService.
			getAttractionDomesticServicesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _attractionDomesticServiceLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionDomesticService
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionDomesticServiceException {

		return _attractionDomesticServiceLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionDomesticServiceLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionDomesticServiceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the attraction domestic service in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionDomesticServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionDomesticService the attraction domestic service
	 * @return the attraction domestic service that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionDomesticService
		updateAttractionDomesticService(
			com.nbp.jtb.application.form.service.model.AttractionDomesticService
				attractionDomesticService) {

		return _attractionDomesticServiceLocalService.
			updateAttractionDomesticService(attractionDomesticService);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _attractionDomesticServiceLocalService.getBasePersistence();
	}

	@Override
	public AttractionDomesticServiceLocalService getWrappedService() {
		return _attractionDomesticServiceLocalService;
	}

	@Override
	public void setWrappedService(
		AttractionDomesticServiceLocalService
			attractionDomesticServiceLocalService) {

		_attractionDomesticServiceLocalService =
			attractionDomesticServiceLocalService;
	}

	private AttractionDomesticServiceLocalService
		_attractionDomesticServiceLocalService;

}