/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.stages.service.exception.NoSuchMedicalPaymentConfirmationException;
import com.nbp.medical.stages.service.model.MedicalPaymentConfirmation;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for MedicalPaymentConfirmation. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalPaymentConfirmationLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface MedicalPaymentConfirmationLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.nbp.medical.stages.service.service.impl.MedicalPaymentConfirmationLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the medical payment confirmation local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link MedicalPaymentConfirmationLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the medical payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalPaymentConfirmation the medical payment confirmation
	 * @return the medical payment confirmation that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public MedicalPaymentConfirmation addMedicalPaymentConfirmation(
		MedicalPaymentConfirmation medicalPaymentConfirmation);

	/**
	 * Creates a new medical payment confirmation with the primary key. Does not add the medical payment confirmation to the database.
	 *
	 * @param medicalPaymentConfirmationId the primary key for the new medical payment confirmation
	 * @return the new medical payment confirmation
	 */
	@Transactional(enabled = false)
	public MedicalPaymentConfirmation createMedicalPaymentConfirmation(
		long medicalPaymentConfirmationId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the medical payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalPaymentConfirmationId the primary key of the medical payment confirmation
	 * @return the medical payment confirmation that was removed
	 * @throws PortalException if a medical payment confirmation with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public MedicalPaymentConfirmation deleteMedicalPaymentConfirmation(
			long medicalPaymentConfirmationId)
		throws PortalException;

	/**
	 * Deletes the medical payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalPaymentConfirmation the medical payment confirmation
	 * @return the medical payment confirmation that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public MedicalPaymentConfirmation deleteMedicalPaymentConfirmation(
		MedicalPaymentConfirmation medicalPaymentConfirmation);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> T dslQuery(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int dslQueryCount(DSLQuery dslQuery);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MedicalPaymentConfirmation fetchMedicalPaymentConfirmation(
		long medicalPaymentConfirmationId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MedicalPaymentConfirmation> getMedicalPayConfBy_CI(
		String caseId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MedicalPaymentConfirmation getMedicalPaymentConfBy_CI(String caseId)
		throws NoSuchMedicalPaymentConfirmationException;

	/**
	 * Returns the medical payment confirmation with the primary key.
	 *
	 * @param medicalPaymentConfirmationId the primary key of the medical payment confirmation
	 * @return the medical payment confirmation
	 * @throws PortalException if a medical payment confirmation with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public MedicalPaymentConfirmation getMedicalPaymentConfirmation(
			long medicalPaymentConfirmationId)
		throws PortalException;

	/**
	 * Returns a range of all the medical payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical payment confirmations
	 * @param end the upper bound of the range of medical payment confirmations (not inclusive)
	 * @return the range of medical payment confirmations
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<MedicalPaymentConfirmation> getMedicalPaymentConfirmations(
		int start, int end);

	/**
	 * Returns the number of medical payment confirmations.
	 *
	 * @return the number of medical payment confirmations
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getMedicalPaymentConfirmationsCount();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Updates the medical payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalPaymentConfirmation the medical payment confirmation
	 * @return the medical payment confirmation that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public MedicalPaymentConfirmation updateMedicalPaymentConfirmation(
		MedicalPaymentConfirmation medicalPaymentConfirmation);

	public MedicalPaymentConfirmation updateMedicalPaymentConfirmation(
		String caseId, Date dateReceived, String amountDue,
		String amountReceived, String receiptNumber, String comment,
		String amountOutstanding, Date dueDate, String status);

}