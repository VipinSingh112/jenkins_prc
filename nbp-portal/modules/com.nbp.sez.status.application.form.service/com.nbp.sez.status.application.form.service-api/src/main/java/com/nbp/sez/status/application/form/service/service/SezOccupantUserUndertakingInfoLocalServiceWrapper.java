/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezOccupantUserUndertakingInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantUserUndertakingInfoLocalService
 * @generated
 */
public class SezOccupantUserUndertakingInfoLocalServiceWrapper
	implements ServiceWrapper<SezOccupantUserUndertakingInfoLocalService>,
			   SezOccupantUserUndertakingInfoLocalService {

	public SezOccupantUserUndertakingInfoLocalServiceWrapper() {
		this(null);
	}

	public SezOccupantUserUndertakingInfoLocalServiceWrapper(
		SezOccupantUserUndertakingInfoLocalService
			sezOccupantUserUndertakingInfoLocalService) {

		_sezOccupantUserUndertakingInfoLocalService =
			sezOccupantUserUndertakingInfoLocalService;
	}

	/**
	 * Adds the sez occupant user undertaking info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantUserUndertakingInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantUserUndertakingInfo the sez occupant user undertaking info
	 * @return the sez occupant user undertaking info that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantUserUndertakingInfo addSezOccupantUserUndertakingInfo(
			com.nbp.sez.status.application.form.service.model.
				SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo) {

		return _sezOccupantUserUndertakingInfoLocalService.
			addSezOccupantUserUndertakingInfo(sezOccupantUserUndertakingInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantUserUndertakingInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez occupant user undertaking info with the primary key. Does not add the sez occupant user undertaking info to the database.
	 *
	 * @param sezOccUserunderId the primary key for the new sez occupant user undertaking info
	 * @return the new sez occupant user undertaking info
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantUserUndertakingInfo createSezOccupantUserUndertakingInfo(
			long sezOccUserunderId) {

		return _sezOccupantUserUndertakingInfoLocalService.
			createSezOccupantUserUndertakingInfo(sezOccUserunderId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantUserUndertakingInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez occupant user undertaking info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantUserUndertakingInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccUserunderId the primary key of the sez occupant user undertaking info
	 * @return the sez occupant user undertaking info that was removed
	 * @throws PortalException if a sez occupant user undertaking info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantUserUndertakingInfo deleteSezOccupantUserUndertakingInfo(
				long sezOccUserunderId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantUserUndertakingInfoLocalService.
			deleteSezOccupantUserUndertakingInfo(sezOccUserunderId);
	}

	/**
	 * Deletes the sez occupant user undertaking info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantUserUndertakingInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantUserUndertakingInfo the sez occupant user undertaking info
	 * @return the sez occupant user undertaking info that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantUserUndertakingInfo deleteSezOccupantUserUndertakingInfo(
			com.nbp.sez.status.application.form.service.model.
				SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo) {

		return _sezOccupantUserUndertakingInfoLocalService.
			deleteSezOccupantUserUndertakingInfo(
				sezOccupantUserUndertakingInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezOccupantUserUndertakingInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezOccupantUserUndertakingInfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezOccupantUserUndertakingInfoLocalService.dynamicQuery();
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

		return _sezOccupantUserUndertakingInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantUserUndertakingInfoModelImpl</code>.
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

		return _sezOccupantUserUndertakingInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantUserUndertakingInfoModelImpl</code>.
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

		return _sezOccupantUserUndertakingInfoLocalService.dynamicQuery(
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

		return _sezOccupantUserUndertakingInfoLocalService.dynamicQueryCount(
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

		return _sezOccupantUserUndertakingInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantUserUndertakingInfo fetchSezOccupantUserUndertakingInfo(
			long sezOccUserunderId) {

		return _sezOccupantUserUndertakingInfoLocalService.
			fetchSezOccupantUserUndertakingInfo(sezOccUserunderId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezOccupantUserUndertakingInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezOccupantUserUndertakingInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantUserUndertakingInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantUserUndertakingInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the sez occupant user undertaking info with the primary key.
	 *
	 * @param sezOccUserunderId the primary key of the sez occupant user undertaking info
	 * @return the sez occupant user undertaking info
	 * @throws PortalException if a sez occupant user undertaking info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantUserUndertakingInfo getSezOccupantUserUndertakingInfo(
				long sezOccUserunderId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantUserUndertakingInfoLocalService.
			getSezOccupantUserUndertakingInfo(sezOccUserunderId);
	}

	/**
	 * Returns a range of all the sez occupant user undertaking infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantUserUndertakingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant user undertaking infos
	 * @param end the upper bound of the range of sez occupant user undertaking infos (not inclusive)
	 * @return the range of sez occupant user undertaking infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezOccupantUserUndertakingInfo> getSezOccupantUserUndertakingInfos(
				int start, int end) {

		return _sezOccupantUserUndertakingInfoLocalService.
			getSezOccupantUserUndertakingInfos(start, end);
	}

	/**
	 * Returns the number of sez occupant user undertaking infos.
	 *
	 * @return the number of sez occupant user undertaking infos
	 */
	@Override
	public int getSezOccupantUserUndertakingInfosCount() {
		return _sezOccupantUserUndertakingInfoLocalService.
			getSezOccupantUserUndertakingInfosCount();
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantUserUndertakingInfo getSezStatusBy_Id(long sezApplicationId)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezOccupantUserUndertakingInfoException {

		return _sezOccupantUserUndertakingInfoLocalService.getSezStatusBy_Id(
			sezApplicationId);
	}

	/**
	 * Updates the sez occupant user undertaking info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantUserUndertakingInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantUserUndertakingInfo the sez occupant user undertaking info
	 * @return the sez occupant user undertaking info that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezOccupantUserUndertakingInfo updateSezOccupantUserUndertakingInfo(
			com.nbp.sez.status.application.form.service.model.
				SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo) {

		return _sezOccupantUserUndertakingInfoLocalService.
			updateSezOccupantUserUndertakingInfo(
				sezOccupantUserUndertakingInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezOccupantUserUndertakingInfoLocalService.getBasePersistence();
	}

	@Override
	public SezOccupantUserUndertakingInfoLocalService getWrappedService() {
		return _sezOccupantUserUndertakingInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezOccupantUserUndertakingInfoLocalService
			sezOccupantUserUndertakingInfoLocalService) {

		_sezOccupantUserUndertakingInfoLocalService =
			sezOccupantUserUndertakingInfoLocalService;
	}

	private SezOccupantUserUndertakingInfoLocalService
		_sezOccupantUserUndertakingInfoLocalService;

}