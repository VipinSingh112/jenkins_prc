/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezOccupantShareHoldingInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantShareHoldingInfoLocalService
 * @generated
 */
public class SezOccupantShareHoldingInfoLocalServiceWrapper
	implements ServiceWrapper<SezOccupantShareHoldingInfoLocalService>,
			   SezOccupantShareHoldingInfoLocalService {

	public SezOccupantShareHoldingInfoLocalServiceWrapper() {
		this(null);
	}

	public SezOccupantShareHoldingInfoLocalServiceWrapper(
		SezOccupantShareHoldingInfoLocalService
			sezOccupantShareHoldingInfoLocalService) {

		_sezOccupantShareHoldingInfoLocalService =
			sezOccupantShareHoldingInfoLocalService;
	}

	/**
	 * Adds the sez occupant share holding info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantShareHoldingInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantShareHoldingInfo the sez occupant share holding info
	 * @return the sez occupant share holding info that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantShareHoldingInfo addSezOccupantShareHoldingInfo(
			com.nbp.sez.status.application.form.service.model.
				SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo) {

		return _sezOccupantShareHoldingInfoLocalService.
			addSezOccupantShareHoldingInfo(sezOccupantShareHoldingInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantShareHoldingInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez occupant share holding info with the primary key. Does not add the sez occupant share holding info to the database.
	 *
	 * @param sezOccShareHolderId the primary key for the new sez occupant share holding info
	 * @return the new sez occupant share holding info
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantShareHoldingInfo createSezOccupantShareHoldingInfo(
			long sezOccShareHolderId) {

		return _sezOccupantShareHoldingInfoLocalService.
			createSezOccupantShareHoldingInfo(sezOccShareHolderId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantShareHoldingInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez occupant share holding info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantShareHoldingInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccShareHolderId the primary key of the sez occupant share holding info
	 * @return the sez occupant share holding info that was removed
	 * @throws PortalException if a sez occupant share holding info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantShareHoldingInfo deleteSezOccupantShareHoldingInfo(
				long sezOccShareHolderId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantShareHoldingInfoLocalService.
			deleteSezOccupantShareHoldingInfo(sezOccShareHolderId);
	}

	/**
	 * Deletes the sez occupant share holding info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantShareHoldingInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantShareHoldingInfo the sez occupant share holding info
	 * @return the sez occupant share holding info that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantShareHoldingInfo deleteSezOccupantShareHoldingInfo(
			com.nbp.sez.status.application.form.service.model.
				SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo) {

		return _sezOccupantShareHoldingInfoLocalService.
			deleteSezOccupantShareHoldingInfo(sezOccupantShareHoldingInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezOccupantShareHoldingInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezOccupantShareHoldingInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezOccupantShareHoldingInfoLocalService.dynamicQuery();
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

		return _sezOccupantShareHoldingInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantShareHoldingInfoModelImpl</code>.
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

		return _sezOccupantShareHoldingInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantShareHoldingInfoModelImpl</code>.
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

		return _sezOccupantShareHoldingInfoLocalService.dynamicQuery(
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

		return _sezOccupantShareHoldingInfoLocalService.dynamicQueryCount(
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

		return _sezOccupantShareHoldingInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantShareHoldingInfo fetchSezOccupantShareHoldingInfo(
			long sezOccShareHolderId) {

		return _sezOccupantShareHoldingInfoLocalService.
			fetchSezOccupantShareHoldingInfo(sezOccShareHolderId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezOccupantShareHoldingInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezOccupantShareHoldingInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantShareHoldingInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantShareHoldingInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the sez occupant share holding info with the primary key.
	 *
	 * @param sezOccShareHolderId the primary key of the sez occupant share holding info
	 * @return the sez occupant share holding info
	 * @throws PortalException if a sez occupant share holding info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantShareHoldingInfo getSezOccupantShareHoldingInfo(
				long sezOccShareHolderId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantShareHoldingInfoLocalService.
			getSezOccupantShareHoldingInfo(sezOccShareHolderId);
	}

	/**
	 * Returns a range of all the sez occupant share holding infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantShareHoldingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant share holding infos
	 * @param end the upper bound of the range of sez occupant share holding infos (not inclusive)
	 * @return the range of sez occupant share holding infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezOccupantShareHoldingInfo> getSezOccupantShareHoldingInfos(
				int start, int end) {

		return _sezOccupantShareHoldingInfoLocalService.
			getSezOccupantShareHoldingInfos(start, end);
	}

	/**
	 * Returns the number of sez occupant share holding infos.
	 *
	 * @return the number of sez occupant share holding infos
	 */
	@Override
	public int getSezOccupantShareHoldingInfosCount() {
		return _sezOccupantShareHoldingInfoLocalService.
			getSezOccupantShareHoldingInfosCount();
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantShareHoldingInfo getSezStatusBy_App_Id(long sezApplicationId)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezOccupantShareHoldingInfoException {

		return _sezOccupantShareHoldingInfoLocalService.getSezStatusBy_App_Id(
			sezApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezOccupantShareHoldingInfo> getSezStatusBy_Id(
				long sezApplicationId) {

		return _sezOccupantShareHoldingInfoLocalService.getSezStatusBy_Id(
			sezApplicationId);
	}

	/**
	 * Updates the sez occupant share holding info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantShareHoldingInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantShareHoldingInfo the sez occupant share holding info
	 * @return the sez occupant share holding info that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantShareHoldingInfo updateSezOccupantShareHoldingInfo(
			com.nbp.sez.status.application.form.service.model.
				SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo) {

		return _sezOccupantShareHoldingInfoLocalService.
			updateSezOccupantShareHoldingInfo(sezOccupantShareHoldingInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezOccupantShareHoldingInfoLocalService.getBasePersistence();
	}

	@Override
	public SezOccupantShareHoldingInfoLocalService getWrappedService() {
		return _sezOccupantShareHoldingInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezOccupantShareHoldingInfoLocalService
			sezOccupantShareHoldingInfoLocalService) {

		_sezOccupantShareHoldingInfoLocalService =
			sezOccupantShareHoldingInfoLocalService;
	}

	private SezOccupantShareHoldingInfoLocalService
		_sezOccupantShareHoldingInfoLocalService;

}