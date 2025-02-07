/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismSummaryAddBoxLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismSummaryAddBoxLocalService
 * @generated
 */
public class TourismSummaryAddBoxLocalServiceWrapper
	implements ServiceWrapper<TourismSummaryAddBoxLocalService>,
			   TourismSummaryAddBoxLocalService {

	public TourismSummaryAddBoxLocalServiceWrapper() {
		this(null);
	}

	public TourismSummaryAddBoxLocalServiceWrapper(
		TourismSummaryAddBoxLocalService tourismSummaryAddBoxLocalService) {

		_tourismSummaryAddBoxLocalService = tourismSummaryAddBoxLocalService;
	}

	/**
	 * Adds the tourism summary add box to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismSummaryAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismSummaryAddBox the tourism summary add box
	 * @return the tourism summary add box that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.TourismSummaryAddBox
		addTourismSummaryAddBox(
			com.nbp.tourism.application.form.services.model.TourismSummaryAddBox
				tourismSummaryAddBox) {

		return _tourismSummaryAddBoxLocalService.addTourismSummaryAddBox(
			tourismSummaryAddBox);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismSummaryAddBoxLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism summary add box with the primary key. Does not add the tourism summary add box to the database.
	 *
	 * @param tourismSummaryBoxId the primary key for the new tourism summary add box
	 * @return the new tourism summary add box
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.TourismSummaryAddBox
		createTourismSummaryAddBox(long tourismSummaryBoxId) {

		return _tourismSummaryAddBoxLocalService.createTourismSummaryAddBox(
			tourismSummaryBoxId);
	}

	@Override
	public void deleteBYId(long applicatioId) {
		_tourismSummaryAddBoxLocalService.deleteBYId(applicatioId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismSummaryAddBoxLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism summary add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismSummaryAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismSummaryBoxId the primary key of the tourism summary add box
	 * @return the tourism summary add box that was removed
	 * @throws PortalException if a tourism summary add box with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.TourismSummaryAddBox
			deleteTourismSummaryAddBox(long tourismSummaryBoxId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismSummaryAddBoxLocalService.deleteTourismSummaryAddBox(
			tourismSummaryBoxId);
	}

	/**
	 * Deletes the tourism summary add box from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismSummaryAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismSummaryAddBox the tourism summary add box
	 * @return the tourism summary add box that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.TourismSummaryAddBox
		deleteTourismSummaryAddBox(
			com.nbp.tourism.application.form.services.model.TourismSummaryAddBox
				tourismSummaryAddBox) {

		return _tourismSummaryAddBoxLocalService.deleteTourismSummaryAddBox(
			tourismSummaryAddBox);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismSummaryAddBoxLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismSummaryAddBoxLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismSummaryAddBoxLocalService.dynamicQuery();
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

		return _tourismSummaryAddBoxLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismSummaryAddBoxModelImpl</code>.
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

		return _tourismSummaryAddBoxLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismSummaryAddBoxModelImpl</code>.
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

		return _tourismSummaryAddBoxLocalService.dynamicQuery(
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

		return _tourismSummaryAddBoxLocalService.dynamicQueryCount(
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

		return _tourismSummaryAddBoxLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.TourismSummaryAddBox
		fetchTourismSummaryAddBox(long tourismSummaryBoxId) {

		return _tourismSummaryAddBoxLocalService.fetchTourismSummaryAddBox(
			tourismSummaryBoxId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismSummaryAddBoxLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismSummaryAddBoxLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismSummaryAddBoxLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismSummaryAddBoxLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.TourismSummaryAddBox>
			getTAP_TAI(long applicationId) {

		return _tourismSummaryAddBoxLocalService.getTAP_TAI(applicationId);
	}

	/**
	 * Returns the tourism summary add box with the primary key.
	 *
	 * @param tourismSummaryBoxId the primary key of the tourism summary add box
	 * @return the tourism summary add box
	 * @throws PortalException if a tourism summary add box with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.TourismSummaryAddBox
			getTourismSummaryAddBox(long tourismSummaryBoxId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismSummaryAddBoxLocalService.getTourismSummaryAddBox(
			tourismSummaryBoxId);
	}

	/**
	 * Returns a range of all the tourism summary add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismSummaryAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism summary add boxes
	 * @param end the upper bound of the range of tourism summary add boxes (not inclusive)
	 * @return the range of tourism summary add boxes
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.TourismSummaryAddBox>
			getTourismSummaryAddBoxes(int start, int end) {

		return _tourismSummaryAddBoxLocalService.getTourismSummaryAddBoxes(
			start, end);
	}

	/**
	 * Returns the number of tourism summary add boxes.
	 *
	 * @return the number of tourism summary add boxes
	 */
	@Override
	public int getTourismSummaryAddBoxesCount() {
		return _tourismSummaryAddBoxLocalService.
			getTourismSummaryAddBoxesCount();
	}

	/**
	 * Updates the tourism summary add box in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismSummaryAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismSummaryAddBox the tourism summary add box
	 * @return the tourism summary add box that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.TourismSummaryAddBox
		updateTourismSummaryAddBox(
			com.nbp.tourism.application.form.services.model.TourismSummaryAddBox
				tourismSummaryAddBox) {

		return _tourismSummaryAddBoxLocalService.updateTourismSummaryAddBox(
			tourismSummaryAddBox);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismSummaryAddBoxLocalService.getBasePersistence();
	}

	@Override
	public TourismSummaryAddBoxLocalService getWrappedService() {
		return _tourismSummaryAddBoxLocalService;
	}

	@Override
	public void setWrappedService(
		TourismSummaryAddBoxLocalService tourismSummaryAddBoxLocalService) {

		_tourismSummaryAddBoxLocalService = tourismSummaryAddBoxLocalService;
	}

	private TourismSummaryAddBoxLocalService _tourismSummaryAddBoxLocalService;

}