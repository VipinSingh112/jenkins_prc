/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezOccupantEmploymentInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantEmploymentInfoLocalService
 * @generated
 */
public class SezOccupantEmploymentInfoLocalServiceWrapper
	implements ServiceWrapper<SezOccupantEmploymentInfoLocalService>,
			   SezOccupantEmploymentInfoLocalService {

	public SezOccupantEmploymentInfoLocalServiceWrapper() {
		this(null);
	}

	public SezOccupantEmploymentInfoLocalServiceWrapper(
		SezOccupantEmploymentInfoLocalService
			sezOccupantEmploymentInfoLocalService) {

		_sezOccupantEmploymentInfoLocalService =
			sezOccupantEmploymentInfoLocalService;
	}

	/**
	 * Adds the sez occupant employment info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantEmploymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantEmploymentInfo the sez occupant employment info
	 * @return the sez occupant employment info that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezOccupantEmploymentInfo addSezOccupantEmploymentInfo(
				com.nbp.sez.status.application.form.service.model.
					SezOccupantEmploymentInfo sezOccupantEmploymentInfo) {

		return _sezOccupantEmploymentInfoLocalService.
			addSezOccupantEmploymentInfo(sezOccupantEmploymentInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantEmploymentInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez occupant employment info with the primary key. Does not add the sez occupant employment info to the database.
	 *
	 * @param sezOccEmpId the primary key for the new sez occupant employment info
	 * @return the new sez occupant employment info
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezOccupantEmploymentInfo createSezOccupantEmploymentInfo(
				long sezOccEmpId) {

		return _sezOccupantEmploymentInfoLocalService.
			createSezOccupantEmploymentInfo(sezOccEmpId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantEmploymentInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez occupant employment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantEmploymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccEmpId the primary key of the sez occupant employment info
	 * @return the sez occupant employment info that was removed
	 * @throws PortalException if a sez occupant employment info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezOccupantEmploymentInfo deleteSezOccupantEmploymentInfo(
					long sezOccEmpId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantEmploymentInfoLocalService.
			deleteSezOccupantEmploymentInfo(sezOccEmpId);
	}

	/**
	 * Deletes the sez occupant employment info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantEmploymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantEmploymentInfo the sez occupant employment info
	 * @return the sez occupant employment info that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezOccupantEmploymentInfo deleteSezOccupantEmploymentInfo(
				com.nbp.sez.status.application.form.service.model.
					SezOccupantEmploymentInfo sezOccupantEmploymentInfo) {

		return _sezOccupantEmploymentInfoLocalService.
			deleteSezOccupantEmploymentInfo(sezOccupantEmploymentInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezOccupantEmploymentInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezOccupantEmploymentInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezOccupantEmploymentInfoLocalService.dynamicQuery();
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

		return _sezOccupantEmploymentInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantEmploymentInfoModelImpl</code>.
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

		return _sezOccupantEmploymentInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantEmploymentInfoModelImpl</code>.
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

		return _sezOccupantEmploymentInfoLocalService.dynamicQuery(
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

		return _sezOccupantEmploymentInfoLocalService.dynamicQueryCount(
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

		return _sezOccupantEmploymentInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezOccupantEmploymentInfo fetchSezOccupantEmploymentInfo(
				long sezOccEmpId) {

		return _sezOccupantEmploymentInfoLocalService.
			fetchSezOccupantEmploymentInfo(sezOccEmpId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezOccupantEmploymentInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezOccupantEmploymentInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantEmploymentInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantEmploymentInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the sez occupant employment info with the primary key.
	 *
	 * @param sezOccEmpId the primary key of the sez occupant employment info
	 * @return the sez occupant employment info
	 * @throws PortalException if a sez occupant employment info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezOccupantEmploymentInfo getSezOccupantEmploymentInfo(
					long sezOccEmpId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantEmploymentInfoLocalService.
			getSezOccupantEmploymentInfo(sezOccEmpId);
	}

	/**
	 * Returns a range of all the sez occupant employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant employment infos
	 * @param end the upper bound of the range of sez occupant employment infos (not inclusive)
	 * @return the range of sez occupant employment infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezOccupantEmploymentInfo> getSezOccupantEmploymentInfos(
				int start, int end) {

		return _sezOccupantEmploymentInfoLocalService.
			getSezOccupantEmploymentInfos(start, end);
	}

	/**
	 * Returns the number of sez occupant employment infos.
	 *
	 * @return the number of sez occupant employment infos
	 */
	@Override
	public int getSezOccupantEmploymentInfosCount() {
		return _sezOccupantEmploymentInfoLocalService.
			getSezOccupantEmploymentInfosCount();
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezOccupantEmploymentInfo> getSezStatusBy_ID(
				long sezApplicationId) {

		return _sezOccupantEmploymentInfoLocalService.getSezStatusBy_ID(
			sezApplicationId);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezOccupantEmploymentInfo getSezStatusBy_Id(long sezApplicationId)
				throws com.nbp.sez.status.application.form.service.exception.
					NoSuchSezOccupantEmploymentInfoException {

		return _sezOccupantEmploymentInfoLocalService.getSezStatusBy_Id(
			sezApplicationId);
	}

	/**
	 * Updates the sez occupant employment info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantEmploymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantEmploymentInfo the sez occupant employment info
	 * @return the sez occupant employment info that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezOccupantEmploymentInfo updateSezOccupantEmploymentInfo(
				com.nbp.sez.status.application.form.service.model.
					SezOccupantEmploymentInfo sezOccupantEmploymentInfo) {

		return _sezOccupantEmploymentInfoLocalService.
			updateSezOccupantEmploymentInfo(sezOccupantEmploymentInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezOccupantEmploymentInfoLocalService.getBasePersistence();
	}

	@Override
	public SezOccupantEmploymentInfoLocalService getWrappedService() {
		return _sezOccupantEmploymentInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezOccupantEmploymentInfoLocalService
			sezOccupantEmploymentInfoLocalService) {

		_sezOccupantEmploymentInfoLocalService =
			sezOccupantEmploymentInfoLocalService;
	}

	private SezOccupantEmploymentInfoLocalService
		_sezOccupantEmploymentInfoLocalService;

}