/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddLabMedicalPhysicalSecLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalPhysicalSecLocalService
 * @generated
 */
public class AddLabMedicalPhysicalSecLocalServiceWrapper
	implements AddLabMedicalPhysicalSecLocalService,
			   ServiceWrapper<AddLabMedicalPhysicalSecLocalService> {

	public AddLabMedicalPhysicalSecLocalServiceWrapper() {
		this(null);
	}

	public AddLabMedicalPhysicalSecLocalServiceWrapper(
		AddLabMedicalPhysicalSecLocalService
			addLabMedicalPhysicalSecLocalService) {

		_addLabMedicalPhysicalSecLocalService =
			addLabMedicalPhysicalSecLocalService;
	}

	/**
	 * Adds the add lab medical physical sec to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalPhysicalSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalPhysicalSec the add lab medical physical sec
	 * @return the add lab medical physical sec that was added
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalSec
			addAddLabMedicalPhysicalSec(
				com.nbp.janaac.application.form.service.model.
					AddLabMedicalPhysicalSec addLabMedicalPhysicalSec) {

		return _addLabMedicalPhysicalSecLocalService.
			addAddLabMedicalPhysicalSec(addLabMedicalPhysicalSec);
	}

	/**
	 * Creates a new add lab medical physical sec with the primary key. Does not add the add lab medical physical sec to the database.
	 *
	 * @param addLabMedicalPhysicalSecId the primary key for the new add lab medical physical sec
	 * @return the new add lab medical physical sec
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalSec
			createAddLabMedicalPhysicalSec(long addLabMedicalPhysicalSecId) {

		return _addLabMedicalPhysicalSecLocalService.
			createAddLabMedicalPhysicalSec(addLabMedicalPhysicalSecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalPhysicalSecLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add lab medical physical sec from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalPhysicalSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalPhysicalSec the add lab medical physical sec
	 * @return the add lab medical physical sec that was removed
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalSec
			deleteAddLabMedicalPhysicalSec(
				com.nbp.janaac.application.form.service.model.
					AddLabMedicalPhysicalSec addLabMedicalPhysicalSec) {

		return _addLabMedicalPhysicalSecLocalService.
			deleteAddLabMedicalPhysicalSec(addLabMedicalPhysicalSec);
	}

	/**
	 * Deletes the add lab medical physical sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalPhysicalSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalPhysicalSecId the primary key of the add lab medical physical sec
	 * @return the add lab medical physical sec that was removed
	 * @throws PortalException if a add lab medical physical sec with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalSec
				deleteAddLabMedicalPhysicalSec(long addLabMedicalPhysicalSecId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalPhysicalSecLocalService.
			deleteAddLabMedicalPhysicalSec(addLabMedicalPhysicalSecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalPhysicalSecLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addLabMedicalPhysicalSecLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addLabMedicalPhysicalSecLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addLabMedicalPhysicalSecLocalService.dynamicQuery();
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

		return _addLabMedicalPhysicalSecLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalPhysicalSecModelImpl</code>.
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

		return _addLabMedicalPhysicalSecLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalPhysicalSecModelImpl</code>.
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

		return _addLabMedicalPhysicalSecLocalService.dynamicQuery(
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

		return _addLabMedicalPhysicalSecLocalService.dynamicQueryCount(
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

		return _addLabMedicalPhysicalSecLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalSec
			fetchAddLabMedicalPhysicalSec(long addLabMedicalPhysicalSecId) {

		return _addLabMedicalPhysicalSecLocalService.
			fetchAddLabMedicalPhysicalSec(addLabMedicalPhysicalSecId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addLabMedicalPhysicalSecLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the add lab medical physical sec with the primary key.
	 *
	 * @param addLabMedicalPhysicalSecId the primary key of the add lab medical physical sec
	 * @return the add lab medical physical sec
	 * @throws PortalException if a add lab medical physical sec with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalSec
				getAddLabMedicalPhysicalSec(long addLabMedicalPhysicalSecId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalPhysicalSecLocalService.
			getAddLabMedicalPhysicalSec(addLabMedicalPhysicalSecId);
	}

	/**
	 * Returns a range of all the add lab medical physical secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalPhysicalSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical physical secs
	 * @param end the upper bound of the range of add lab medical physical secs (not inclusive)
	 * @return the range of add lab medical physical secs
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalSec>
			getAddLabMedicalPhysicalSecs(int start, int end) {

		return _addLabMedicalPhysicalSecLocalService.
			getAddLabMedicalPhysicalSecs(start, end);
	}

	/**
	 * Returns the number of add lab medical physical secs.
	 *
	 * @return the number of add lab medical physical secs
	 */
	@Override
	public int getAddLabMedicalPhysicalSecsCount() {
		return _addLabMedicalPhysicalSecLocalService.
			getAddLabMedicalPhysicalSecsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addLabMedicalPhysicalSecLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalSec>
			getJanaacById(long janaacApplicationId) {

		return _addLabMedicalPhysicalSecLocalService.getJanaacById(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabMedicalPhysicalSecLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalPhysicalSecLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add lab medical physical sec in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalPhysicalSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalPhysicalSec the add lab medical physical sec
	 * @return the add lab medical physical sec that was updated
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalSec
			updateAddLabMedicalPhysicalSec(
				com.nbp.janaac.application.form.service.model.
					AddLabMedicalPhysicalSec addLabMedicalPhysicalSec) {

		return _addLabMedicalPhysicalSecLocalService.
			updateAddLabMedicalPhysicalSec(addLabMedicalPhysicalSec);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addLabMedicalPhysicalSecLocalService.getBasePersistence();
	}

	@Override
	public AddLabMedicalPhysicalSecLocalService getWrappedService() {
		return _addLabMedicalPhysicalSecLocalService;
	}

	@Override
	public void setWrappedService(
		AddLabMedicalPhysicalSecLocalService
			addLabMedicalPhysicalSecLocalService) {

		_addLabMedicalPhysicalSecLocalService =
			addLabMedicalPhysicalSecLocalService;
	}

	private AddLabMedicalPhysicalSecLocalService
		_addLabMedicalPhysicalSecLocalService;

}