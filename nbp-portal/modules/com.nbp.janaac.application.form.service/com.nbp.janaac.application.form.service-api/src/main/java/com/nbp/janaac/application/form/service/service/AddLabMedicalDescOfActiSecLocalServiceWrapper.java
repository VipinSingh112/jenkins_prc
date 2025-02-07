/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddLabMedicalDescOfActiSecLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalDescOfActiSecLocalService
 * @generated
 */
public class AddLabMedicalDescOfActiSecLocalServiceWrapper
	implements AddLabMedicalDescOfActiSecLocalService,
			   ServiceWrapper<AddLabMedicalDescOfActiSecLocalService> {

	public AddLabMedicalDescOfActiSecLocalServiceWrapper() {
		this(null);
	}

	public AddLabMedicalDescOfActiSecLocalServiceWrapper(
		AddLabMedicalDescOfActiSecLocalService
			addLabMedicalDescOfActiSecLocalService) {

		_addLabMedicalDescOfActiSecLocalService =
			addLabMedicalDescOfActiSecLocalService;
	}

	/**
	 * Adds the add lab medical desc of acti sec to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalDescOfActiSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalDescOfActiSec the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec that was added
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalDescOfActiSec
			addAddLabMedicalDescOfActiSec(
				com.nbp.janaac.application.form.service.model.
					AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec) {

		return _addLabMedicalDescOfActiSecLocalService.
			addAddLabMedicalDescOfActiSec(addLabMedicalDescOfActiSec);
	}

	/**
	 * Creates a new add lab medical desc of acti sec with the primary key. Does not add the add lab medical desc of acti sec to the database.
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key for the new add lab medical desc of acti sec
	 * @return the new add lab medical desc of acti sec
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalDescOfActiSec
			createAddLabMedicalDescOfActiSec(
				long addLabMedicalDescOfActiSecId) {

		return _addLabMedicalDescOfActiSecLocalService.
			createAddLabMedicalDescOfActiSec(addLabMedicalDescOfActiSecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalDescOfActiSecLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add lab medical desc of acti sec from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalDescOfActiSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalDescOfActiSec the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec that was removed
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalDescOfActiSec
			deleteAddLabMedicalDescOfActiSec(
				com.nbp.janaac.application.form.service.model.
					AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec) {

		return _addLabMedicalDescOfActiSecLocalService.
			deleteAddLabMedicalDescOfActiSec(addLabMedicalDescOfActiSec);
	}

	/**
	 * Deletes the add lab medical desc of acti sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalDescOfActiSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key of the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec that was removed
	 * @throws PortalException if a add lab medical desc of acti sec with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalDescOfActiSec
				deleteAddLabMedicalDescOfActiSec(
					long addLabMedicalDescOfActiSecId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalDescOfActiSecLocalService.
			deleteAddLabMedicalDescOfActiSec(addLabMedicalDescOfActiSecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalDescOfActiSecLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addLabMedicalDescOfActiSecLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addLabMedicalDescOfActiSecLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addLabMedicalDescOfActiSecLocalService.dynamicQuery();
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

		return _addLabMedicalDescOfActiSecLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalDescOfActiSecModelImpl</code>.
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

		return _addLabMedicalDescOfActiSecLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalDescOfActiSecModelImpl</code>.
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

		return _addLabMedicalDescOfActiSecLocalService.dynamicQuery(
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

		return _addLabMedicalDescOfActiSecLocalService.dynamicQueryCount(
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

		return _addLabMedicalDescOfActiSecLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalDescOfActiSec
			fetchAddLabMedicalDescOfActiSec(long addLabMedicalDescOfActiSecId) {

		return _addLabMedicalDescOfActiSecLocalService.
			fetchAddLabMedicalDescOfActiSec(addLabMedicalDescOfActiSecId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addLabMedicalDescOfActiSecLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the add lab medical desc of acti sec with the primary key.
	 *
	 * @param addLabMedicalDescOfActiSecId the primary key of the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec
	 * @throws PortalException if a add lab medical desc of acti sec with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalDescOfActiSec
				getAddLabMedicalDescOfActiSec(long addLabMedicalDescOfActiSecId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalDescOfActiSecLocalService.
			getAddLabMedicalDescOfActiSec(addLabMedicalDescOfActiSecId);
	}

	/**
	 * Returns a range of all the add lab medical desc of acti secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalDescOfActiSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical desc of acti secs
	 * @param end the upper bound of the range of add lab medical desc of acti secs (not inclusive)
	 * @return the range of add lab medical desc of acti secs
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.
			AddLabMedicalDescOfActiSec> getAddLabMedicalDescOfActiSecs(
				int start, int end) {

		return _addLabMedicalDescOfActiSecLocalService.
			getAddLabMedicalDescOfActiSecs(start, end);
	}

	/**
	 * Returns the number of add lab medical desc of acti secs.
	 *
	 * @return the number of add lab medical desc of acti secs
	 */
	@Override
	public int getAddLabMedicalDescOfActiSecsCount() {
		return _addLabMedicalDescOfActiSecLocalService.
			getAddLabMedicalDescOfActiSecsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addLabMedicalDescOfActiSecLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.
			AddLabMedicalDescOfActiSec> getJanaacById(
				long janaacApplicationId) {

		return _addLabMedicalDescOfActiSecLocalService.getJanaacById(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabMedicalDescOfActiSecLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalDescOfActiSecLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add lab medical desc of acti sec in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalDescOfActiSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalDescOfActiSec the add lab medical desc of acti sec
	 * @return the add lab medical desc of acti sec that was updated
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalDescOfActiSec
			updateAddLabMedicalDescOfActiSec(
				com.nbp.janaac.application.form.service.model.
					AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec) {

		return _addLabMedicalDescOfActiSecLocalService.
			updateAddLabMedicalDescOfActiSec(addLabMedicalDescOfActiSec);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addLabMedicalDescOfActiSecLocalService.getBasePersistence();
	}

	@Override
	public AddLabMedicalDescOfActiSecLocalService getWrappedService() {
		return _addLabMedicalDescOfActiSecLocalService;
	}

	@Override
	public void setWrappedService(
		AddLabMedicalDescOfActiSecLocalService
			addLabMedicalDescOfActiSecLocalService) {

		_addLabMedicalDescOfActiSecLocalService =
			addLabMedicalDescOfActiSecLocalService;
	}

	private AddLabMedicalDescOfActiSecLocalService
		_addLabMedicalDescOfActiSecLocalService;

}