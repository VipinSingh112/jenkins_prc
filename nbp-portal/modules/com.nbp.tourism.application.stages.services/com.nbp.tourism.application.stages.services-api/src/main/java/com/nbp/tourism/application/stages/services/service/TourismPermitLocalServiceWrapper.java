/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismPermitLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismPermitLocalService
 * @generated
 */
public class TourismPermitLocalServiceWrapper
	implements ServiceWrapper<TourismPermitLocalService>,
			   TourismPermitLocalService {

	public TourismPermitLocalServiceWrapper() {
		this(null);
	}

	public TourismPermitLocalServiceWrapper(
		TourismPermitLocalService tourismPermitLocalService) {

		_tourismPermitLocalService = tourismPermitLocalService;
	}

	/**
	 * Adds the tourism permit to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismPermit the tourism permit
	 * @return the tourism permit that was added
	 */
	@Override
	public com.nbp.tourism.application.stages.services.model.TourismPermit
		addTourismPermit(
			com.nbp.tourism.application.stages.services.model.TourismPermit
				tourismPermit) {

		return _tourismPermitLocalService.addTourismPermit(tourismPermit);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismPermitLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tourism permit with the primary key. Does not add the tourism permit to the database.
	 *
	 * @param tourismgPermitId the primary key for the new tourism permit
	 * @return the new tourism permit
	 */
	@Override
	public com.nbp.tourism.application.stages.services.model.TourismPermit
		createTourismPermit(long tourismgPermitId) {

		return _tourismPermitLocalService.createTourismPermit(tourismgPermitId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismPermitLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the tourism permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismgPermitId the primary key of the tourism permit
	 * @return the tourism permit that was removed
	 * @throws PortalException if a tourism permit with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.stages.services.model.TourismPermit
			deleteTourismPermit(long tourismgPermitId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismPermitLocalService.deleteTourismPermit(tourismgPermitId);
	}

	/**
	 * Deletes the tourism permit from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismPermit the tourism permit
	 * @return the tourism permit that was removed
	 */
	@Override
	public com.nbp.tourism.application.stages.services.model.TourismPermit
		deleteTourismPermit(
			com.nbp.tourism.application.stages.services.model.TourismPermit
				tourismPermit) {

		return _tourismPermitLocalService.deleteTourismPermit(tourismPermit);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismPermitLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismPermitLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismPermitLocalService.dynamicQuery();
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

		return _tourismPermitLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismPermitModelImpl</code>.
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

		return _tourismPermitLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismPermitModelImpl</code>.
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

		return _tourismPermitLocalService.dynamicQuery(
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

		return _tourismPermitLocalService.dynamicQueryCount(dynamicQuery);
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

		return _tourismPermitLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.stages.services.model.TourismPermit
		fetchTourismPermit(long tourismgPermitId) {

		return _tourismPermitLocalService.fetchTourismPermit(tourismgPermitId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismPermitLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismPermitLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismPermitLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismPermitLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the tourism permit with the primary key.
	 *
	 * @param tourismgPermitId the primary key of the tourism permit
	 * @return the tourism permit
	 * @throws PortalException if a tourism permit with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.stages.services.model.TourismPermit
			getTourismPermit(long tourismgPermitId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismPermitLocalService.getTourismPermit(tourismgPermitId);
	}

	/**
	 * Returns a range of all the tourism permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism permits
	 * @param end the upper bound of the range of tourism permits (not inclusive)
	 * @return the range of tourism permits
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.stages.services.model.TourismPermit>
			getTourismPermits(int start, int end) {

		return _tourismPermitLocalService.getTourismPermits(start, end);
	}

	/**
	 * Returns the number of tourism permits.
	 *
	 * @return the number of tourism permits
	 */
	@Override
	public int getTourismPermitsCount() {
		return _tourismPermitLocalService.getTourismPermitsCount();
	}

	@Override
	public com.nbp.tourism.application.stages.services.model.TourismPermit
			getTourisPermitBy_CI(String caseId)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismPermitException {

		return _tourismPermitLocalService.getTourisPermitBy_CI(caseId);
	}

	@Override
	public com.nbp.tourism.application.stages.services.model.TourismPermit
		updateTourismPermit(
			String caseId, String pirPermitNumber, java.util.Date dateOfIssue,
			java.util.Date dateOfExpirartion, String durationOfPermit,
			String typeOfPermit, String numberOfExtension) {

		return _tourismPermitLocalService.updateTourismPermit(
			caseId, pirPermitNumber, dateOfIssue, dateOfExpirartion,
			durationOfPermit, typeOfPermit, numberOfExtension);
	}

	/**
	 * Updates the tourism permit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismPermit the tourism permit
	 * @return the tourism permit that was updated
	 */
	@Override
	public com.nbp.tourism.application.stages.services.model.TourismPermit
		updateTourismPermit(
			com.nbp.tourism.application.stages.services.model.TourismPermit
				tourismPermit) {

		return _tourismPermitLocalService.updateTourismPermit(tourismPermit);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismPermitLocalService.getBasePersistence();
	}

	@Override
	public TourismPermitLocalService getWrappedService() {
		return _tourismPermitLocalService;
	}

	@Override
	public void setWrappedService(
		TourismPermitLocalService tourismPermitLocalService) {

		_tourismPermitLocalService = tourismPermitLocalService;
	}

	private TourismPermitLocalService _tourismPermitLocalService;

}