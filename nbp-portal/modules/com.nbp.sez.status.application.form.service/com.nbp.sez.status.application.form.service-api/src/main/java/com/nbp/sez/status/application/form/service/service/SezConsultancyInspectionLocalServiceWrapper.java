/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezConsultancyInspectionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezConsultancyInspectionLocalService
 * @generated
 */
public class SezConsultancyInspectionLocalServiceWrapper
	implements ServiceWrapper<SezConsultancyInspectionLocalService>,
			   SezConsultancyInspectionLocalService {

	public SezConsultancyInspectionLocalServiceWrapper() {
		this(null);
	}

	public SezConsultancyInspectionLocalServiceWrapper(
		SezConsultancyInspectionLocalService
			sezConsultancyInspectionLocalService) {

		_sezConsultancyInspectionLocalService =
			sezConsultancyInspectionLocalService;
	}

	/**
	 * Adds the sez consultancy inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezConsultancyInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezConsultancyInspection the sez consultancy inspection
	 * @return the sez consultancy inspection that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezConsultancyInspection addSezConsultancyInspection(
				com.nbp.sez.status.application.form.service.model.
					SezConsultancyInspection sezConsultancyInspection) {

		return _sezConsultancyInspectionLocalService.
			addSezConsultancyInspection(sezConsultancyInspection);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezConsultancyInspectionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez consultancy inspection with the primary key. Does not add the sez consultancy inspection to the database.
	 *
	 * @param sezConsultancyInspectionId the primary key for the new sez consultancy inspection
	 * @return the new sez consultancy inspection
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezConsultancyInspection createSezConsultancyInspection(
				long sezConsultancyInspectionId) {

		return _sezConsultancyInspectionLocalService.
			createSezConsultancyInspection(sezConsultancyInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezConsultancyInspectionLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez consultancy inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezConsultancyInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezConsultancyInspectionId the primary key of the sez consultancy inspection
	 * @return the sez consultancy inspection that was removed
	 * @throws PortalException if a sez consultancy inspection with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezConsultancyInspection deleteSezConsultancyInspection(
					long sezConsultancyInspectionId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezConsultancyInspectionLocalService.
			deleteSezConsultancyInspection(sezConsultancyInspectionId);
	}

	/**
	 * Deletes the sez consultancy inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezConsultancyInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezConsultancyInspection the sez consultancy inspection
	 * @return the sez consultancy inspection that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezConsultancyInspection deleteSezConsultancyInspection(
				com.nbp.sez.status.application.form.service.model.
					SezConsultancyInspection sezConsultancyInspection) {

		return _sezConsultancyInspectionLocalService.
			deleteSezConsultancyInspection(sezConsultancyInspection);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezConsultancyInspectionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezConsultancyInspectionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezConsultancyInspectionLocalService.dynamicQuery();
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

		return _sezConsultancyInspectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezConsultancyInspectionModelImpl</code>.
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

		return _sezConsultancyInspectionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezConsultancyInspectionModelImpl</code>.
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

		return _sezConsultancyInspectionLocalService.dynamicQuery(
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

		return _sezConsultancyInspectionLocalService.dynamicQueryCount(
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

		return _sezConsultancyInspectionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezConsultancyInspection fetchSezConsultancyInspection(
				long sezConsultancyInspectionId) {

		return _sezConsultancyInspectionLocalService.
			fetchSezConsultancyInspection(sezConsultancyInspectionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezConsultancyInspectionLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezConsultancyInspectionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezConsultancyInspectionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezConsultancyInspectionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezConsultancyInspection getSezConsultancyByCat(String doYouWant)
				throws com.nbp.sez.status.application.form.service.exception.
					NoSuchSezConsultancyInspectionException {

		return _sezConsultancyInspectionLocalService.getSezConsultancyByCat(
			doYouWant);
	}

	/**
	 * Returns the sez consultancy inspection with the primary key.
	 *
	 * @param sezConsultancyInspectionId the primary key of the sez consultancy inspection
	 * @return the sez consultancy inspection
	 * @throws PortalException if a sez consultancy inspection with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezConsultancyInspection getSezConsultancyInspection(
					long sezConsultancyInspectionId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezConsultancyInspectionLocalService.
			getSezConsultancyInspection(sezConsultancyInspectionId);
	}

	/**
	 * Returns a range of all the sez consultancy inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezConsultancyInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez consultancy inspections
	 * @param end the upper bound of the range of sez consultancy inspections (not inclusive)
	 * @return the range of sez consultancy inspections
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezConsultancyInspection> getSezConsultancyInspections(
				int start, int end) {

		return _sezConsultancyInspectionLocalService.
			getSezConsultancyInspections(start, end);
	}

	/**
	 * Returns the number of sez consultancy inspections.
	 *
	 * @return the number of sez consultancy inspections
	 */
	@Override
	public int getSezConsultancyInspectionsCount() {
		return _sezConsultancyInspectionLocalService.
			getSezConsultancyInspectionsCount();
	}

	/**
	 * Updates the sez consultancy inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezConsultancyInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezConsultancyInspection the sez consultancy inspection
	 * @return the sez consultancy inspection that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezConsultancyInspection updateSezConsultancyInspection(
				com.nbp.sez.status.application.form.service.model.
					SezConsultancyInspection sezConsultancyInspection) {

		return _sezConsultancyInspectionLocalService.
			updateSezConsultancyInspection(sezConsultancyInspection);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezConsultancyInspectionLocalService.getBasePersistence();
	}

	@Override
	public SezConsultancyInspectionLocalService getWrappedService() {
		return _sezConsultancyInspectionLocalService;
	}

	@Override
	public void setWrappedService(
		SezConsultancyInspectionLocalService
			sezConsultancyInspectionLocalService) {

		_sezConsultancyInspectionLocalService =
			sezConsultancyInspectionLocalService;
	}

	private SezConsultancyInspectionLocalService
		_sezConsultancyInspectionLocalService;

}