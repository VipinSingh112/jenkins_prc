/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AttractionDomesticTourLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionDomesticTourLocalService
 * @generated
 */
public class AttractionDomesticTourLocalServiceWrapper
	implements AttractionDomesticTourLocalService,
			   ServiceWrapper<AttractionDomesticTourLocalService> {

	public AttractionDomesticTourLocalServiceWrapper() {
		this(null);
	}

	public AttractionDomesticTourLocalServiceWrapper(
		AttractionDomesticTourLocalService attractionDomesticTourLocalService) {

		_attractionDomesticTourLocalService =
			attractionDomesticTourLocalService;
	}

	/**
	 * Adds the attraction domestic tour to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionDomesticTourLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionDomesticTour the attraction domestic tour
	 * @return the attraction domestic tour that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionDomesticTour
		addAttractionDomesticTour(
			com.nbp.jtb.application.form.service.model.AttractionDomesticTour
				attractionDomesticTour) {

		return _attractionDomesticTourLocalService.addAttractionDomesticTour(
			attractionDomesticTour);
	}

	/**
	 * Creates a new attraction domestic tour with the primary key. Does not add the attraction domestic tour to the database.
	 *
	 * @param attractionDomesticTourId the primary key for the new attraction domestic tour
	 * @return the new attraction domestic tour
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionDomesticTour
		createAttractionDomesticTour(long attractionDomesticTourId) {

		return _attractionDomesticTourLocalService.createAttractionDomesticTour(
			attractionDomesticTourId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionDomesticTourLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the attraction domestic tour from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionDomesticTourLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionDomesticTour the attraction domestic tour
	 * @return the attraction domestic tour that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionDomesticTour
		deleteAttractionDomesticTour(
			com.nbp.jtb.application.form.service.model.AttractionDomesticTour
				attractionDomesticTour) {

		return _attractionDomesticTourLocalService.deleteAttractionDomesticTour(
			attractionDomesticTour);
	}

	/**
	 * Deletes the attraction domestic tour with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionDomesticTourLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionDomesticTourId the primary key of the attraction domestic tour
	 * @return the attraction domestic tour that was removed
	 * @throws PortalException if a attraction domestic tour with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionDomesticTour
			deleteAttractionDomesticTour(long attractionDomesticTourId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionDomesticTourLocalService.deleteAttractionDomesticTour(
			attractionDomesticTourId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionDomesticTourLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _attractionDomesticTourLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _attractionDomesticTourLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _attractionDomesticTourLocalService.dynamicQuery();
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

		return _attractionDomesticTourLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionDomesticTourModelImpl</code>.
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

		return _attractionDomesticTourLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionDomesticTourModelImpl</code>.
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

		return _attractionDomesticTourLocalService.dynamicQuery(
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

		return _attractionDomesticTourLocalService.dynamicQueryCount(
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

		return _attractionDomesticTourLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionDomesticTour
		fetchAttractionDomesticTour(long attractionDomesticTourId) {

		return _attractionDomesticTourLocalService.fetchAttractionDomesticTour(
			attractionDomesticTourId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _attractionDomesticTourLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the attraction domestic tour with the primary key.
	 *
	 * @param attractionDomesticTourId the primary key of the attraction domestic tour
	 * @return the attraction domestic tour
	 * @throws PortalException if a attraction domestic tour with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionDomesticTour
			getAttractionDomesticTour(long attractionDomesticTourId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionDomesticTourLocalService.getAttractionDomesticTour(
			attractionDomesticTourId);
	}

	/**
	 * Returns a range of all the attraction domestic tours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionDomesticTourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic tours
	 * @param end the upper bound of the range of attraction domestic tours (not inclusive)
	 * @return the range of attraction domestic tours
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AttractionDomesticTour>
			getAttractionDomesticTours(int start, int end) {

		return _attractionDomesticTourLocalService.getAttractionDomesticTours(
			start, end);
	}

	/**
	 * Returns the number of attraction domestic tours.
	 *
	 * @return the number of attraction domestic tours
	 */
	@Override
	public int getAttractionDomesticToursCount() {
		return _attractionDomesticTourLocalService.
			getAttractionDomesticToursCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _attractionDomesticTourLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionDomesticTour
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionDomesticTourException {

		return _attractionDomesticTourLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionDomesticTourLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionDomesticTourLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the attraction domestic tour in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionDomesticTourLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionDomesticTour the attraction domestic tour
	 * @return the attraction domestic tour that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionDomesticTour
		updateAttractionDomesticTour(
			com.nbp.jtb.application.form.service.model.AttractionDomesticTour
				attractionDomesticTour) {

		return _attractionDomesticTourLocalService.updateAttractionDomesticTour(
			attractionDomesticTour);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _attractionDomesticTourLocalService.getBasePersistence();
	}

	@Override
	public AttractionDomesticTourLocalService getWrappedService() {
		return _attractionDomesticTourLocalService;
	}

	@Override
	public void setWrappedService(
		AttractionDomesticTourLocalService attractionDomesticTourLocalService) {

		_attractionDomesticTourLocalService =
			attractionDomesticTourLocalService;
	}

	private AttractionDomesticTourLocalService
		_attractionDomesticTourLocalService;

}