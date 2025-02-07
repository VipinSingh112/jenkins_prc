/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddLabCalibraStrucReqSecLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabCalibraStrucReqSecLocalService
 * @generated
 */
public class AddLabCalibraStrucReqSecLocalServiceWrapper
	implements AddLabCalibraStrucReqSecLocalService,
			   ServiceWrapper<AddLabCalibraStrucReqSecLocalService> {

	public AddLabCalibraStrucReqSecLocalServiceWrapper() {
		this(null);
	}

	public AddLabCalibraStrucReqSecLocalServiceWrapper(
		AddLabCalibraStrucReqSecLocalService
			addLabCalibraStrucReqSecLocalService) {

		_addLabCalibraStrucReqSecLocalService =
			addLabCalibraStrucReqSecLocalService;
	}

	/**
	 * Adds the add lab calibra struc req sec to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabCalibraStrucReqSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabCalibraStrucReqSec the add lab calibra struc req sec
	 * @return the add lab calibra struc req sec that was added
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabCalibraStrucReqSec
			addAddLabCalibraStrucReqSec(
				com.nbp.janaac.application.form.service.model.
					AddLabCalibraStrucReqSec addLabCalibraStrucReqSec) {

		return _addLabCalibraStrucReqSecLocalService.
			addAddLabCalibraStrucReqSec(addLabCalibraStrucReqSec);
	}

	/**
	 * Creates a new add lab calibra struc req sec with the primary key. Does not add the add lab calibra struc req sec to the database.
	 *
	 * @param addLabCalibraStrucReqSecId the primary key for the new add lab calibra struc req sec
	 * @return the new add lab calibra struc req sec
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabCalibraStrucReqSec
			createAddLabCalibraStrucReqSec(long addLabCalibraStrucReqSecId) {

		return _addLabCalibraStrucReqSecLocalService.
			createAddLabCalibraStrucReqSec(addLabCalibraStrucReqSecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabCalibraStrucReqSecLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add lab calibra struc req sec from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabCalibraStrucReqSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabCalibraStrucReqSec the add lab calibra struc req sec
	 * @return the add lab calibra struc req sec that was removed
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabCalibraStrucReqSec
			deleteAddLabCalibraStrucReqSec(
				com.nbp.janaac.application.form.service.model.
					AddLabCalibraStrucReqSec addLabCalibraStrucReqSec) {

		return _addLabCalibraStrucReqSecLocalService.
			deleteAddLabCalibraStrucReqSec(addLabCalibraStrucReqSec);
	}

	/**
	 * Deletes the add lab calibra struc req sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabCalibraStrucReqSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabCalibraStrucReqSecId the primary key of the add lab calibra struc req sec
	 * @return the add lab calibra struc req sec that was removed
	 * @throws PortalException if a add lab calibra struc req sec with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabCalibraStrucReqSec
				deleteAddLabCalibraStrucReqSec(long addLabCalibraStrucReqSecId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabCalibraStrucReqSecLocalService.
			deleteAddLabCalibraStrucReqSec(addLabCalibraStrucReqSecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabCalibraStrucReqSecLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addLabCalibraStrucReqSecLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addLabCalibraStrucReqSecLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addLabCalibraStrucReqSecLocalService.dynamicQuery();
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

		return _addLabCalibraStrucReqSecLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabCalibraStrucReqSecModelImpl</code>.
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

		return _addLabCalibraStrucReqSecLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabCalibraStrucReqSecModelImpl</code>.
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

		return _addLabCalibraStrucReqSecLocalService.dynamicQuery(
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

		return _addLabCalibraStrucReqSecLocalService.dynamicQueryCount(
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

		return _addLabCalibraStrucReqSecLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabCalibraStrucReqSec
			fetchAddLabCalibraStrucReqSec(long addLabCalibraStrucReqSecId) {

		return _addLabCalibraStrucReqSecLocalService.
			fetchAddLabCalibraStrucReqSec(addLabCalibraStrucReqSecId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addLabCalibraStrucReqSecLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the add lab calibra struc req sec with the primary key.
	 *
	 * @param addLabCalibraStrucReqSecId the primary key of the add lab calibra struc req sec
	 * @return the add lab calibra struc req sec
	 * @throws PortalException if a add lab calibra struc req sec with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabCalibraStrucReqSec
				getAddLabCalibraStrucReqSec(long addLabCalibraStrucReqSecId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabCalibraStrucReqSecLocalService.
			getAddLabCalibraStrucReqSec(addLabCalibraStrucReqSecId);
	}

	/**
	 * Returns a range of all the add lab calibra struc req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabCalibraStrucReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab calibra struc req secs
	 * @param end the upper bound of the range of add lab calibra struc req secs (not inclusive)
	 * @return the range of add lab calibra struc req secs
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddLabCalibraStrucReqSec>
			getAddLabCalibraStrucReqSecs(int start, int end) {

		return _addLabCalibraStrucReqSecLocalService.
			getAddLabCalibraStrucReqSecs(start, end);
	}

	/**
	 * Returns the number of add lab calibra struc req secs.
	 *
	 * @return the number of add lab calibra struc req secs
	 */
	@Override
	public int getAddLabCalibraStrucReqSecsCount() {
		return _addLabCalibraStrucReqSecLocalService.
			getAddLabCalibraStrucReqSecsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addLabCalibraStrucReqSecLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddLabCalibraStrucReqSec>
			getJanaacById(long janaacApplicationId) {

		return _addLabCalibraStrucReqSecLocalService.getJanaacById(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabCalibraStrucReqSecLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabCalibraStrucReqSecLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add lab calibra struc req sec in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabCalibraStrucReqSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabCalibraStrucReqSec the add lab calibra struc req sec
	 * @return the add lab calibra struc req sec that was updated
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabCalibraStrucReqSec
			updateAddLabCalibraStrucReqSec(
				com.nbp.janaac.application.form.service.model.
					AddLabCalibraStrucReqSec addLabCalibraStrucReqSec) {

		return _addLabCalibraStrucReqSecLocalService.
			updateAddLabCalibraStrucReqSec(addLabCalibraStrucReqSec);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addLabCalibraStrucReqSecLocalService.getBasePersistence();
	}

	@Override
	public AddLabCalibraStrucReqSecLocalService getWrappedService() {
		return _addLabCalibraStrucReqSecLocalService;
	}

	@Override
	public void setWrappedService(
		AddLabCalibraStrucReqSecLocalService
			addLabCalibraStrucReqSecLocalService) {

		_addLabCalibraStrucReqSecLocalService =
			addLabCalibraStrucReqSecLocalService;
	}

	private AddLabCalibraStrucReqSecLocalService
		_addLabCalibraStrucReqSecLocalService;

}