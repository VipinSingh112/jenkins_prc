/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.services.application.form.service.exception.NoSuchOSIServiceCurrentStageException;
import com.nbp.osi.services.application.form.service.model.OSIServiceCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi service current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceCurrentStageUtil
 * @generated
 */
@ProviderType
public interface OSIServiceCurrentStagePersistence
	extends BasePersistence<OSIServiceCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OSIServiceCurrentStageUtil} to access the osi service current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi service current stage where osiServicesApplicationId = &#63; or throws a <code>NoSuchOSIServiceCurrentStageException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service current stage
	 * @throws NoSuchOSIServiceCurrentStageException if a matching osi service current stage could not be found
	 */
	public OSIServiceCurrentStage findBygetOSIService_ById(
			long osiServicesApplicationId)
		throws NoSuchOSIServiceCurrentStageException;

	/**
	 * Returns the osi service current stage where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service current stage, or <code>null</code> if a matching osi service current stage could not be found
	 */
	public OSIServiceCurrentStage fetchBygetOSIService_ById(
		long osiServicesApplicationId);

	/**
	 * Returns the osi service current stage where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi service current stage, or <code>null</code> if a matching osi service current stage could not be found
	 */
	public OSIServiceCurrentStage fetchBygetOSIService_ById(
		long osiServicesApplicationId, boolean useFinderCache);

	/**
	 * Removes the osi service current stage where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi service current stage that was removed
	 */
	public OSIServiceCurrentStage removeBygetOSIService_ById(
			long osiServicesApplicationId)
		throws NoSuchOSIServiceCurrentStageException;

	/**
	 * Returns the number of osi service current stages where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi service current stages
	 */
	public int countBygetOSIService_ById(long osiServicesApplicationId);

	/**
	 * Returns all the osi service current stages where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service current stages
	 */
	public java.util.List<OSIServiceCurrentStage> findBygetOSI_CS_OSIAI(
		long osiServicesApplicationId);

	/**
	 * Returns a range of all the osi service current stages where osiServicesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param start the lower bound of the range of osi service current stages
	 * @param end the upper bound of the range of osi service current stages (not inclusive)
	 * @return the range of matching osi service current stages
	 */
	public java.util.List<OSIServiceCurrentStage> findBygetOSI_CS_OSIAI(
		long osiServicesApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the osi service current stages where osiServicesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param start the lower bound of the range of osi service current stages
	 * @param end the upper bound of the range of osi service current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi service current stages
	 */
	public java.util.List<OSIServiceCurrentStage> findBygetOSI_CS_OSIAI(
		long osiServicesApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServiceCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi service current stages where osiServicesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param start the lower bound of the range of osi service current stages
	 * @param end the upper bound of the range of osi service current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi service current stages
	 */
	public java.util.List<OSIServiceCurrentStage> findBygetOSI_CS_OSIAI(
		long osiServicesApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServiceCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi service current stage in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi service current stage
	 * @throws NoSuchOSIServiceCurrentStageException if a matching osi service current stage could not be found
	 */
	public OSIServiceCurrentStage findBygetOSI_CS_OSIAI_First(
			long osiServicesApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OSIServiceCurrentStage> orderByComparator)
		throws NoSuchOSIServiceCurrentStageException;

	/**
	 * Returns the first osi service current stage in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi service current stage, or <code>null</code> if a matching osi service current stage could not be found
	 */
	public OSIServiceCurrentStage fetchBygetOSI_CS_OSIAI_First(
		long osiServicesApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServiceCurrentStage>
			orderByComparator);

	/**
	 * Returns the last osi service current stage in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi service current stage
	 * @throws NoSuchOSIServiceCurrentStageException if a matching osi service current stage could not be found
	 */
	public OSIServiceCurrentStage findBygetOSI_CS_OSIAI_Last(
			long osiServicesApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OSIServiceCurrentStage> orderByComparator)
		throws NoSuchOSIServiceCurrentStageException;

	/**
	 * Returns the last osi service current stage in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi service current stage, or <code>null</code> if a matching osi service current stage could not be found
	 */
	public OSIServiceCurrentStage fetchBygetOSI_CS_OSIAI_Last(
		long osiServicesApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServiceCurrentStage>
			orderByComparator);

	/**
	 * Returns the osi service current stages before and after the current osi service current stage in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiCurrentStageId the primary key of the current osi service current stage
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi service current stage
	 * @throws NoSuchOSIServiceCurrentStageException if a osi service current stage with the primary key could not be found
	 */
	public OSIServiceCurrentStage[] findBygetOSI_CS_OSIAI_PrevAndNext(
			long osiCurrentStageId, long osiServicesApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OSIServiceCurrentStage> orderByComparator)
		throws NoSuchOSIServiceCurrentStageException;

	/**
	 * Removes all the osi service current stages where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 */
	public void removeBygetOSI_CS_OSIAI(long osiServicesApplicationId);

	/**
	 * Returns the number of osi service current stages where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi service current stages
	 */
	public int countBygetOSI_CS_OSIAI(long osiServicesApplicationId);

	/**
	 * Caches the osi service current stage in the entity cache if it is enabled.
	 *
	 * @param osiServiceCurrentStage the osi service current stage
	 */
	public void cacheResult(OSIServiceCurrentStage osiServiceCurrentStage);

	/**
	 * Caches the osi service current stages in the entity cache if it is enabled.
	 *
	 * @param osiServiceCurrentStages the osi service current stages
	 */
	public void cacheResult(
		java.util.List<OSIServiceCurrentStage> osiServiceCurrentStages);

	/**
	 * Creates a new osi service current stage with the primary key. Does not add the osi service current stage to the database.
	 *
	 * @param osiCurrentStageId the primary key for the new osi service current stage
	 * @return the new osi service current stage
	 */
	public OSIServiceCurrentStage create(long osiCurrentStageId);

	/**
	 * Removes the osi service current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiCurrentStageId the primary key of the osi service current stage
	 * @return the osi service current stage that was removed
	 * @throws NoSuchOSIServiceCurrentStageException if a osi service current stage with the primary key could not be found
	 */
	public OSIServiceCurrentStage remove(long osiCurrentStageId)
		throws NoSuchOSIServiceCurrentStageException;

	public OSIServiceCurrentStage updateImpl(
		OSIServiceCurrentStage osiServiceCurrentStage);

	/**
	 * Returns the osi service current stage with the primary key or throws a <code>NoSuchOSIServiceCurrentStageException</code> if it could not be found.
	 *
	 * @param osiCurrentStageId the primary key of the osi service current stage
	 * @return the osi service current stage
	 * @throws NoSuchOSIServiceCurrentStageException if a osi service current stage with the primary key could not be found
	 */
	public OSIServiceCurrentStage findByPrimaryKey(long osiCurrentStageId)
		throws NoSuchOSIServiceCurrentStageException;

	/**
	 * Returns the osi service current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiCurrentStageId the primary key of the osi service current stage
	 * @return the osi service current stage, or <code>null</code> if a osi service current stage with the primary key could not be found
	 */
	public OSIServiceCurrentStage fetchByPrimaryKey(long osiCurrentStageId);

	/**
	 * Returns all the osi service current stages.
	 *
	 * @return the osi service current stages
	 */
	public java.util.List<OSIServiceCurrentStage> findAll();

	/**
	 * Returns a range of all the osi service current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service current stages
	 * @param end the upper bound of the range of osi service current stages (not inclusive)
	 * @return the range of osi service current stages
	 */
	public java.util.List<OSIServiceCurrentStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi service current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service current stages
	 * @param end the upper bound of the range of osi service current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi service current stages
	 */
	public java.util.List<OSIServiceCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServiceCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi service current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service current stages
	 * @param end the upper bound of the range of osi service current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi service current stages
	 */
	public java.util.List<OSIServiceCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OSIServiceCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi service current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi service current stages.
	 *
	 * @return the number of osi service current stages
	 */
	public int countAll();

}