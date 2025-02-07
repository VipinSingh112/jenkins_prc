/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JtbAddListVehicleRegstLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddListVehicleRegstLocalService
 * @generated
 */
public class JtbAddListVehicleRegstLocalServiceWrapper
	implements JtbAddListVehicleRegstLocalService,
			   ServiceWrapper<JtbAddListVehicleRegstLocalService> {

	public JtbAddListVehicleRegstLocalServiceWrapper() {
		this(null);
	}

	public JtbAddListVehicleRegstLocalServiceWrapper(
		JtbAddListVehicleRegstLocalService jtbAddListVehicleRegstLocalService) {

		_jtbAddListVehicleRegstLocalService =
			jtbAddListVehicleRegstLocalService;
	}

	/**
	 * Adds the jtb add list vehicle regst to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddListVehicleRegstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddListVehicleRegst the jtb add list vehicle regst
	 * @return the jtb add list vehicle regst that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst
		addJtbAddListVehicleRegst(
			com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst
				jtbAddListVehicleRegst) {

		return _jtbAddListVehicleRegstLocalService.addJtbAddListVehicleRegst(
			jtbAddListVehicleRegst);
	}

	/**
	 * Creates a new jtb add list vehicle regst with the primary key. Does not add the jtb add list vehicle regst to the database.
	 *
	 * @param jtbAddListVehicleRegstId the primary key for the new jtb add list vehicle regst
	 * @return the new jtb add list vehicle regst
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst
		createJtbAddListVehicleRegst(long jtbAddListVehicleRegstId) {

		return _jtbAddListVehicleRegstLocalService.createJtbAddListVehicleRegst(
			jtbAddListVehicleRegstId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddListVehicleRegstLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jtb add list vehicle regst from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddListVehicleRegstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddListVehicleRegst the jtb add list vehicle regst
	 * @return the jtb add list vehicle regst that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst
		deleteJtbAddListVehicleRegst(
			com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst
				jtbAddListVehicleRegst) {

		return _jtbAddListVehicleRegstLocalService.deleteJtbAddListVehicleRegst(
			jtbAddListVehicleRegst);
	}

	/**
	 * Deletes the jtb add list vehicle regst with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddListVehicleRegstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddListVehicleRegstId the primary key of the jtb add list vehicle regst
	 * @return the jtb add list vehicle regst that was removed
	 * @throws PortalException if a jtb add list vehicle regst with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst
			deleteJtbAddListVehicleRegst(long jtbAddListVehicleRegstId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddListVehicleRegstLocalService.deleteJtbAddListVehicleRegst(
			jtbAddListVehicleRegstId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddListVehicleRegstLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jtbAddListVehicleRegstLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jtbAddListVehicleRegstLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jtbAddListVehicleRegstLocalService.dynamicQuery();
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

		return _jtbAddListVehicleRegstLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbAddListVehicleRegstModelImpl</code>.
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

		return _jtbAddListVehicleRegstLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbAddListVehicleRegstModelImpl</code>.
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

		return _jtbAddListVehicleRegstLocalService.dynamicQuery(
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

		return _jtbAddListVehicleRegstLocalService.dynamicQueryCount(
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

		return _jtbAddListVehicleRegstLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst
		fetchJtbAddListVehicleRegst(long jtbAddListVehicleRegstId) {

		return _jtbAddListVehicleRegstLocalService.fetchJtbAddListVehicleRegst(
			jtbAddListVehicleRegstId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jtbAddListVehicleRegstLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst>
			getByJtbAppId(long jtbApplicationId) {

		return _jtbAddListVehicleRegstLocalService.getByJtbAppId(
			jtbApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jtbAddListVehicleRegstLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jtb add list vehicle regst with the primary key.
	 *
	 * @param jtbAddListVehicleRegstId the primary key of the jtb add list vehicle regst
	 * @return the jtb add list vehicle regst
	 * @throws PortalException if a jtb add list vehicle regst with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst
			getJtbAddListVehicleRegst(long jtbAddListVehicleRegstId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddListVehicleRegstLocalService.getJtbAddListVehicleRegst(
			jtbAddListVehicleRegstId);
	}

	/**
	 * Returns a range of all the jtb add list vehicle regsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbAddListVehicleRegstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add list vehicle regsts
	 * @param end the upper bound of the range of jtb add list vehicle regsts (not inclusive)
	 * @return the range of jtb add list vehicle regsts
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst>
			getJtbAddListVehicleRegsts(int start, int end) {

		return _jtbAddListVehicleRegstLocalService.getJtbAddListVehicleRegsts(
			start, end);
	}

	/**
	 * Returns the number of jtb add list vehicle regsts.
	 *
	 * @return the number of jtb add list vehicle regsts
	 */
	@Override
	public int getJtbAddListVehicleRegstsCount() {
		return _jtbAddListVehicleRegstLocalService.
			getJtbAddListVehicleRegstsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbAddListVehicleRegstLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddListVehicleRegstLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the jtb add list vehicle regst in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddListVehicleRegstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddListVehicleRegst the jtb add list vehicle regst
	 * @return the jtb add list vehicle regst that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst
		updateJtbAddListVehicleRegst(
			com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst
				jtbAddListVehicleRegst) {

		return _jtbAddListVehicleRegstLocalService.updateJtbAddListVehicleRegst(
			jtbAddListVehicleRegst);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jtbAddListVehicleRegstLocalService.getBasePersistence();
	}

	@Override
	public JtbAddListVehicleRegstLocalService getWrappedService() {
		return _jtbAddListVehicleRegstLocalService;
	}

	@Override
	public void setWrappedService(
		JtbAddListVehicleRegstLocalService jtbAddListVehicleRegstLocalService) {

		_jtbAddListVehicleRegstLocalService =
			jtbAddListVehicleRegstLocalService;
	}

	private JtbAddListVehicleRegstLocalService
		_jtbAddListVehicleRegstLocalService;

}