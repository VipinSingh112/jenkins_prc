/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ManufacturingPermitLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingPermitLocalService
 * @generated
 */
public class ManufacturingPermitLocalServiceWrapper
	implements ManufacturingPermitLocalService,
			   ServiceWrapper<ManufacturingPermitLocalService> {

	public ManufacturingPermitLocalServiceWrapper() {
		this(null);
	}

	public ManufacturingPermitLocalServiceWrapper(
		ManufacturingPermitLocalService manufacturingPermitLocalService) {

		_manufacturingPermitLocalService = manufacturingPermitLocalService;
	}

	/**
	 * Adds the manufacturing permit to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingPermit the manufacturing permit
	 * @return the manufacturing permit that was added
	 */
	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.
			ManufacturingPermit addManufacturingPermit(
				com.nbp.manufacturing.application.stages.services.model.
					ManufacturingPermit manufacturingPermit) {

		return _manufacturingPermitLocalService.addManufacturingPermit(
			manufacturingPermit);
	}

	/**
	 * Creates a new manufacturing permit with the primary key. Does not add the manufacturing permit to the database.
	 *
	 * @param manufacturingPermitId the primary key for the new manufacturing permit
	 * @return the new manufacturing permit
	 */
	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.
			ManufacturingPermit createManufacturingPermit(
				long manufacturingPermitId) {

		return _manufacturingPermitLocalService.createManufacturingPermit(
			manufacturingPermitId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturingPermitLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the manufacturing permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingPermitId the primary key of the manufacturing permit
	 * @return the manufacturing permit that was removed
	 * @throws PortalException if a manufacturing permit with the primary key could not be found
	 */
	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.
			ManufacturingPermit deleteManufacturingPermit(
					long manufacturingPermitId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturingPermitLocalService.deleteManufacturingPermit(
			manufacturingPermitId);
	}

	/**
	 * Deletes the manufacturing permit from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingPermit the manufacturing permit
	 * @return the manufacturing permit that was removed
	 */
	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.
			ManufacturingPermit deleteManufacturingPermit(
				com.nbp.manufacturing.application.stages.services.model.
					ManufacturingPermit manufacturingPermit) {

		return _manufacturingPermitLocalService.deleteManufacturingPermit(
			manufacturingPermit);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturingPermitLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _manufacturingPermitLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _manufacturingPermitLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _manufacturingPermitLocalService.dynamicQuery();
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

		return _manufacturingPermitLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingPermitModelImpl</code>.
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

		return _manufacturingPermitLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingPermitModelImpl</code>.
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

		return _manufacturingPermitLocalService.dynamicQuery(
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

		return _manufacturingPermitLocalService.dynamicQueryCount(dynamicQuery);
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

		return _manufacturingPermitLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.
			ManufacturingPermit fetchManufacturingPermit(
				long manufacturingPermitId) {

		return _manufacturingPermitLocalService.fetchManufacturingPermit(
			manufacturingPermitId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _manufacturingPermitLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _manufacturingPermitLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the manufacturing permit with the primary key.
	 *
	 * @param manufacturingPermitId the primary key of the manufacturing permit
	 * @return the manufacturing permit
	 * @throws PortalException if a manufacturing permit with the primary key could not be found
	 */
	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.
			ManufacturingPermit getManufacturingPermit(
					long manufacturingPermitId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturingPermitLocalService.getManufacturingPermit(
			manufacturingPermitId);
	}

	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.
			ManufacturingPermit getManufacturingPermitBY_CI(String caseId)
				throws com.nbp.manufacturing.application.stages.services.
					exception.NoSuchManufacturingPermitException {

		return _manufacturingPermitLocalService.getManufacturingPermitBY_CI(
			caseId);
	}

	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.
			ManufacturingPermit getManufacturingPermitBY_Permit(
					String pirPermitNumber)
				throws com.nbp.manufacturing.application.stages.services.
					exception.NoSuchManufacturingPermitException {

		return _manufacturingPermitLocalService.getManufacturingPermitBY_Permit(
			pirPermitNumber);
	}

	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.
			ManufacturingPermit getManufacturingPermitBY_PermitNumber(
					String pirPermitNumber)
				throws com.nbp.manufacturing.application.stages.services.
					exception.NoSuchManufacturingPermitException {

		return _manufacturingPermitLocalService.
			getManufacturingPermitBY_PermitNumber(pirPermitNumber);
	}

	/**
	 * Returns a range of all the manufacturing permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing permits
	 * @param end the upper bound of the range of manufacturing permits (not inclusive)
	 * @return the range of manufacturing permits
	 */
	@Override
	public java.util.List
		<com.nbp.manufacturing.application.stages.services.model.
			ManufacturingPermit> getManufacturingPermits(int start, int end) {

		return _manufacturingPermitLocalService.getManufacturingPermits(
			start, end);
	}

	/**
	 * Returns the number of manufacturing permits.
	 *
	 * @return the number of manufacturing permits
	 */
	@Override
	public int getManufacturingPermitsCount() {
		return _manufacturingPermitLocalService.getManufacturingPermitsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manufacturingPermitLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturingPermitLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the manufacturing permit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingPermit the manufacturing permit
	 * @return the manufacturing permit that was updated
	 */
	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.
			ManufacturingPermit updateManufacturingPermit(
				com.nbp.manufacturing.application.stages.services.model.
					ManufacturingPermit manufacturingPermit) {

		return _manufacturingPermitLocalService.updateManufacturingPermit(
			manufacturingPermit);
	}

	@Override
	public
		com.nbp.manufacturing.application.stages.services.model.
			ManufacturingPermit updateManufacturingPermit(
				String caseId, String pirPermitNumber,
				java.util.Date dateOfIssue, java.util.Date dateOfExpirartion,
				String durationOfPermit, String typeOfPermit,
				String numberOfExtension, String parish) {

		return _manufacturingPermitLocalService.updateManufacturingPermit(
			caseId, pirPermitNumber, dateOfIssue, dateOfExpirartion,
			durationOfPermit, typeOfPermit, numberOfExtension, parish);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _manufacturingPermitLocalService.getBasePersistence();
	}

	@Override
	public ManufacturingPermitLocalService getWrappedService() {
		return _manufacturingPermitLocalService;
	}

	@Override
	public void setWrappedService(
		ManufacturingPermitLocalService manufacturingPermitLocalService) {

		_manufacturingPermitLocalService = manufacturingPermitLocalService;
	}

	private ManufacturingPermitLocalService _manufacturingPermitLocalService;

}