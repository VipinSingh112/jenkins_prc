/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.manufacturing.application.form.service.exception.NoSuchManuAdditionalCompanyInfoException;
import com.nbp.manufacturing.application.form.service.model.ManuAdditionalCompanyInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the manu additional company info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuAdditionalCompanyInfoUtil
 * @generated
 */
@ProviderType
public interface ManuAdditionalCompanyInfoPersistence
	extends BasePersistence<ManuAdditionalCompanyInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ManuAdditionalCompanyInfoUtil} to access the manu additional company info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the manu additional company info where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuAdditionalCompanyInfoException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu additional company info
	 * @throws NoSuchManuAdditionalCompanyInfoException if a matching manu additional company info could not be found
	 */
	public ManuAdditionalCompanyInfo findBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuAdditionalCompanyInfoException;

	/**
	 * Returns the manu additional company info where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu additional company info, or <code>null</code> if a matching manu additional company info could not be found
	 */
	public ManuAdditionalCompanyInfo fetchBygetManufactureById(
		long manufacturingApplicationId);

	/**
	 * Returns the manu additional company info where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu additional company info, or <code>null</code> if a matching manu additional company info could not be found
	 */
	public ManuAdditionalCompanyInfo fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache);

	/**
	 * Removes the manu additional company info where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu additional company info that was removed
	 */
	public ManuAdditionalCompanyInfo removeBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuAdditionalCompanyInfoException;

	/**
	 * Returns the number of manu additional company infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu additional company infos
	 */
	public int countBygetManufactureById(long manufacturingApplicationId);

	/**
	 * Returns all the manu additional company infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu additional company infos
	 */
	public java.util.List<ManuAdditionalCompanyInfo> findBygetMA_ACI_MAI(
		long manufacturingApplicationId);

	/**
	 * Returns a range of all the manu additional company infos where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu additional company infos
	 * @param end the upper bound of the range of manu additional company infos (not inclusive)
	 * @return the range of matching manu additional company infos
	 */
	public java.util.List<ManuAdditionalCompanyInfo> findBygetMA_ACI_MAI(
		long manufacturingApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the manu additional company infos where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu additional company infos
	 * @param end the upper bound of the range of manu additional company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu additional company infos
	 */
	public java.util.List<ManuAdditionalCompanyInfo> findBygetMA_ACI_MAI(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManuAdditionalCompanyInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the manu additional company infos where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu additional company infos
	 * @param end the upper bound of the range of manu additional company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu additional company infos
	 */
	public java.util.List<ManuAdditionalCompanyInfo> findBygetMA_ACI_MAI(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManuAdditionalCompanyInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first manu additional company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu additional company info
	 * @throws NoSuchManuAdditionalCompanyInfoException if a matching manu additional company info could not be found
	 */
	public ManuAdditionalCompanyInfo findBygetMA_ACI_MAI_First(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuAdditionalCompanyInfo> orderByComparator)
		throws NoSuchManuAdditionalCompanyInfoException;

	/**
	 * Returns the first manu additional company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu additional company info, or <code>null</code> if a matching manu additional company info could not be found
	 */
	public ManuAdditionalCompanyInfo fetchBygetMA_ACI_MAI_First(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManuAdditionalCompanyInfo> orderByComparator);

	/**
	 * Returns the last manu additional company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu additional company info
	 * @throws NoSuchManuAdditionalCompanyInfoException if a matching manu additional company info could not be found
	 */
	public ManuAdditionalCompanyInfo findBygetMA_ACI_MAI_Last(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuAdditionalCompanyInfo> orderByComparator)
		throws NoSuchManuAdditionalCompanyInfoException;

	/**
	 * Returns the last manu additional company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu additional company info, or <code>null</code> if a matching manu additional company info could not be found
	 */
	public ManuAdditionalCompanyInfo fetchBygetMA_ACI_MAI_Last(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManuAdditionalCompanyInfo> orderByComparator);

	/**
	 * Returns the manu additional company infos before and after the current manu additional company info in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuAdditionalCompanyInfoId the primary key of the current manu additional company info
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu additional company info
	 * @throws NoSuchManuAdditionalCompanyInfoException if a manu additional company info with the primary key could not be found
	 */
	public ManuAdditionalCompanyInfo[] findBygetMA_ACI_MAI_PrevAndNext(
			long manuAdditionalCompanyInfoId, long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuAdditionalCompanyInfo> orderByComparator)
		throws NoSuchManuAdditionalCompanyInfoException;

	/**
	 * Removes all the manu additional company infos where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public void removeBygetMA_ACI_MAI(long manufacturingApplicationId);

	/**
	 * Returns the number of manu additional company infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu additional company infos
	 */
	public int countBygetMA_ACI_MAI(long manufacturingApplicationId);

	/**
	 * Caches the manu additional company info in the entity cache if it is enabled.
	 *
	 * @param manuAdditionalCompanyInfo the manu additional company info
	 */
	public void cacheResult(
		ManuAdditionalCompanyInfo manuAdditionalCompanyInfo);

	/**
	 * Caches the manu additional company infos in the entity cache if it is enabled.
	 *
	 * @param manuAdditionalCompanyInfos the manu additional company infos
	 */
	public void cacheResult(
		java.util.List<ManuAdditionalCompanyInfo> manuAdditionalCompanyInfos);

	/**
	 * Creates a new manu additional company info with the primary key. Does not add the manu additional company info to the database.
	 *
	 * @param manuAdditionalCompanyInfoId the primary key for the new manu additional company info
	 * @return the new manu additional company info
	 */
	public ManuAdditionalCompanyInfo create(long manuAdditionalCompanyInfoId);

	/**
	 * Removes the manu additional company info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuAdditionalCompanyInfoId the primary key of the manu additional company info
	 * @return the manu additional company info that was removed
	 * @throws NoSuchManuAdditionalCompanyInfoException if a manu additional company info with the primary key could not be found
	 */
	public ManuAdditionalCompanyInfo remove(long manuAdditionalCompanyInfoId)
		throws NoSuchManuAdditionalCompanyInfoException;

	public ManuAdditionalCompanyInfo updateImpl(
		ManuAdditionalCompanyInfo manuAdditionalCompanyInfo);

	/**
	 * Returns the manu additional company info with the primary key or throws a <code>NoSuchManuAdditionalCompanyInfoException</code> if it could not be found.
	 *
	 * @param manuAdditionalCompanyInfoId the primary key of the manu additional company info
	 * @return the manu additional company info
	 * @throws NoSuchManuAdditionalCompanyInfoException if a manu additional company info with the primary key could not be found
	 */
	public ManuAdditionalCompanyInfo findByPrimaryKey(
			long manuAdditionalCompanyInfoId)
		throws NoSuchManuAdditionalCompanyInfoException;

	/**
	 * Returns the manu additional company info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuAdditionalCompanyInfoId the primary key of the manu additional company info
	 * @return the manu additional company info, or <code>null</code> if a manu additional company info with the primary key could not be found
	 */
	public ManuAdditionalCompanyInfo fetchByPrimaryKey(
		long manuAdditionalCompanyInfoId);

	/**
	 * Returns all the manu additional company infos.
	 *
	 * @return the manu additional company infos
	 */
	public java.util.List<ManuAdditionalCompanyInfo> findAll();

	/**
	 * Returns a range of all the manu additional company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu additional company infos
	 * @param end the upper bound of the range of manu additional company infos (not inclusive)
	 * @return the range of manu additional company infos
	 */
	public java.util.List<ManuAdditionalCompanyInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the manu additional company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu additional company infos
	 * @param end the upper bound of the range of manu additional company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu additional company infos
	 */
	public java.util.List<ManuAdditionalCompanyInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManuAdditionalCompanyInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the manu additional company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu additional company infos
	 * @param end the upper bound of the range of manu additional company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu additional company infos
	 */
	public java.util.List<ManuAdditionalCompanyInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManuAdditionalCompanyInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the manu additional company infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of manu additional company infos.
	 *
	 * @return the number of manu additional company infos
	 */
	public int countAll();

}