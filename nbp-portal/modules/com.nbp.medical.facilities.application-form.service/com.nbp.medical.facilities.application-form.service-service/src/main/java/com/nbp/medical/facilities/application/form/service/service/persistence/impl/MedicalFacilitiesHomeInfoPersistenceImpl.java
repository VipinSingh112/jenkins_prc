/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFacilitiesHomeInfoException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesHomeInfo;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesHomeInfoTable;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeInfoImpl;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeInfoModelImpl;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesHomeInfoPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesHomeInfoUtil;
import com.nbp.medical.facilities.application.form.service.service.persistence.impl.constants.MEDICAL_FACILITIESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the medical facilities home info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MedicalFacilitiesHomeInfoPersistence.class)
public class MedicalFacilitiesHomeInfoPersistenceImpl
	extends BasePersistenceImpl<MedicalFacilitiesHomeInfo>
	implements MedicalFacilitiesHomeInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MedicalFacilitiesHomeInfoUtil</code> to access the medical facilities home info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MedicalFacilitiesHomeInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the medical facilities home infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities home infos
	 */
	@Override
	public List<MedicalFacilitiesHomeInfo> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities home infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @return the range of matching medical facilities home infos
	 */
	@Override
	public List<MedicalFacilitiesHomeInfo> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities home infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities home infos
	 */
	@Override
	public List<MedicalFacilitiesHomeInfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities home infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities home infos
	 */
	@Override
	public List<MedicalFacilitiesHomeInfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<MedicalFacilitiesHomeInfo> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesHomeInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo :
						list) {

					if (!uuid.equals(medicalFacilitiesHomeInfo.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_MEDICALFACILITIESHOMEINFO_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MedicalFacilitiesHomeInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<MedicalFacilitiesHomeInfo>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first medical facilities home info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo findByUuid_First(
			String uuid,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeInfoException {

		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo = fetchByUuid_First(
			uuid, orderByComparator);

		if (medicalFacilitiesHomeInfo != null) {
			return medicalFacilitiesHomeInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesHomeInfoException(sb.toString());
	}

	/**
	 * Returns the first medical facilities home info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo fetchByUuid_First(
		String uuid,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		List<MedicalFacilitiesHomeInfo> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities home info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo findByUuid_Last(
			String uuid,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeInfoException {

		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo = fetchByUuid_Last(
			uuid, orderByComparator);

		if (medicalFacilitiesHomeInfo != null) {
			return medicalFacilitiesHomeInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesHomeInfoException(sb.toString());
	}

	/**
	 * Returns the last medical facilities home info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo fetchByUuid_Last(
		String uuid,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesHomeInfo> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities home infos before and after the current medical facilities home info in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the current medical facilities home info
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a medical facilities home info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo[] findByUuid_PrevAndNext(
			long medicalFacilitiesHomeInfoId, String uuid,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeInfoException {

		uuid = Objects.toString(uuid, "");

		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo = findByPrimaryKey(
			medicalFacilitiesHomeInfoId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesHomeInfo[] array =
				new MedicalFacilitiesHomeInfoImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, medicalFacilitiesHomeInfo, uuid, orderByComparator,
				true);

			array[1] = medicalFacilitiesHomeInfo;

			array[2] = getByUuid_PrevAndNext(
				session, medicalFacilitiesHomeInfo, uuid, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MedicalFacilitiesHomeInfo getByUuid_PrevAndNext(
		Session session, MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo,
		String uuid,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MEDICALFACILITIESHOMEINFO_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MedicalFacilitiesHomeInfoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						medicalFacilitiesHomeInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesHomeInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities home infos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(medicalFacilitiesHomeInfo);
		}
	}

	/**
	 * Returns the number of medical facilities home infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities home infos
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESHOMEINFO_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"medicalFacilitiesHomeInfo.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(medicalFacilitiesHomeInfo.uuid IS NULL OR medicalFacilitiesHomeInfo.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the medical facilities home info where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesHomeInfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesHomeInfoException {

		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo = fetchByUUID_G(
			uuid, groupId);

		if (medicalFacilitiesHomeInfo == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalFacilitiesHomeInfoException(sb.toString());
		}

		return medicalFacilitiesHomeInfo;
	}

	/**
	 * Returns the medical facilities home info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the medical facilities home info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof MedicalFacilitiesHomeInfo) {
			MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo =
				(MedicalFacilitiesHomeInfo)result;

			if (!Objects.equals(uuid, medicalFacilitiesHomeInfo.getUuid()) ||
				(groupId != medicalFacilitiesHomeInfo.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MEDICALFACILITIESHOMEINFO_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<MedicalFacilitiesHomeInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo =
						list.get(0);

					result = medicalFacilitiesHomeInfo;

					cacheResult(medicalFacilitiesHomeInfo);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (MedicalFacilitiesHomeInfo)result;
		}
	}

	/**
	 * Removes the medical facilities home info where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities home info that was removed
	 */
	@Override
	public MedicalFacilitiesHomeInfo removeByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesHomeInfoException {

		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo = findByUUID_G(
			uuid, groupId);

		return remove(medicalFacilitiesHomeInfo);
	}

	/**
	 * Returns the number of medical facilities home infos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities home infos
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALFACILITIESHOMEINFO_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"medicalFacilitiesHomeInfo.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(medicalFacilitiesHomeInfo.uuid IS NULL OR medicalFacilitiesHomeInfo.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"medicalFacilitiesHomeInfo.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the medical facilities home infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities home infos
	 */
	@Override
	public List<MedicalFacilitiesHomeInfo> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities home infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @return the range of matching medical facilities home infos
	 */
	@Override
	public List<MedicalFacilitiesHomeInfo> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities home infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities home infos
	 */
	@Override
	public List<MedicalFacilitiesHomeInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities home infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities home infos
	 */
	@Override
	public List<MedicalFacilitiesHomeInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<MedicalFacilitiesHomeInfo> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesHomeInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo :
						list) {

					if (!uuid.equals(medicalFacilitiesHomeInfo.getUuid()) ||
						(companyId !=
							medicalFacilitiesHomeInfo.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_MEDICALFACILITIESHOMEINFO_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MedicalFacilitiesHomeInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<MedicalFacilitiesHomeInfo>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first medical facilities home info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeInfoException {

		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (medicalFacilitiesHomeInfo != null) {
			return medicalFacilitiesHomeInfo;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesHomeInfoException(sb.toString());
	}

	/**
	 * Returns the first medical facilities home info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		List<MedicalFacilitiesHomeInfo> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities home info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeInfoException {

		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (medicalFacilitiesHomeInfo != null) {
			return medicalFacilitiesHomeInfo;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesHomeInfoException(sb.toString());
	}

	/**
	 * Returns the last medical facilities home info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesHomeInfo> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities home infos before and after the current medical facilities home info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the current medical facilities home info
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a medical facilities home info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesHomeInfoId, String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeInfoException {

		uuid = Objects.toString(uuid, "");

		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo = findByPrimaryKey(
			medicalFacilitiesHomeInfoId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesHomeInfo[] array =
				new MedicalFacilitiesHomeInfoImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, medicalFacilitiesHomeInfo, uuid, companyId,
				orderByComparator, true);

			array[1] = medicalFacilitiesHomeInfo;

			array[2] = getByUuid_C_PrevAndNext(
				session, medicalFacilitiesHomeInfo, uuid, companyId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MedicalFacilitiesHomeInfo getByUuid_C_PrevAndNext(
		Session session, MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo,
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_MEDICALFACILITIESHOMEINFO_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MedicalFacilitiesHomeInfoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						medicalFacilitiesHomeInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesHomeInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities home infos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(medicalFacilitiesHomeInfo);
		}
	}

	/**
	 * Returns the number of medical facilities home infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities home infos
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALFACILITIESHOMEINFO_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"medicalFacilitiesHomeInfo.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(medicalFacilitiesHomeInfo.uuid IS NULL OR medicalFacilitiesHomeInfo.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"medicalFacilitiesHomeInfo.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMedicalFacilitiesById;
	private FinderPath
		_finderPathWithoutPaginationFindBygetMedicalFacilitiesById;
	private FinderPath _finderPathCountBygetMedicalFacilitiesById;

	/**
	 * Returns all the medical facilities home infos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities home infos
	 */
	@Override
	public List<MedicalFacilitiesHomeInfo> findBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		return findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities home infos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @return the range of matching medical facilities home infos
	 */
	@Override
	public List<MedicalFacilitiesHomeInfo> findBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, int start, int end) {

		return findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities home infos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities home infos
	 */
	@Override
	public List<MedicalFacilitiesHomeInfo> findBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, int start, int end,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		return findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities home infos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities home infos
	 */
	@Override
	public List<MedicalFacilitiesHomeInfo> findBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, int start, int end,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMedicalFacilitiesById;
				finderArgs = new Object[] {medicalFacilitiesAppId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetMedicalFacilitiesById;
			finderArgs = new Object[] {
				medicalFacilitiesAppId, start, end, orderByComparator
			};
		}

		List<MedicalFacilitiesHomeInfo> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesHomeInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo :
						list) {

					if (medicalFacilitiesAppId !=
							medicalFacilitiesHomeInfo.
								getMedicalFacilitiesAppId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_MEDICALFACILITIESHOMEINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMEDICALFACILITIESBYID_MEDICALFACILITIESAPPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MedicalFacilitiesHomeInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalFacilitiesAppId);

				list = (List<MedicalFacilitiesHomeInfo>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first medical facilities home info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo findBygetMedicalFacilitiesById_First(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeInfoException {

		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo =
			fetchBygetMedicalFacilitiesById_First(
				medicalFacilitiesAppId, orderByComparator);

		if (medicalFacilitiesHomeInfo != null) {
			return medicalFacilitiesHomeInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesHomeInfoException(sb.toString());
	}

	/**
	 * Returns the first medical facilities home info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo fetchBygetMedicalFacilitiesById_First(
		long medicalFacilitiesAppId,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		List<MedicalFacilitiesHomeInfo> list = findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities home info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo findBygetMedicalFacilitiesById_Last(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeInfoException {

		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo =
			fetchBygetMedicalFacilitiesById_Last(
				medicalFacilitiesAppId, orderByComparator);

		if (medicalFacilitiesHomeInfo != null) {
			return medicalFacilitiesHomeInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesHomeInfoException(sb.toString());
	}

	/**
	 * Returns the last medical facilities home info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo fetchBygetMedicalFacilitiesById_Last(
		long medicalFacilitiesAppId,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		int count = countBygetMedicalFacilitiesById(medicalFacilitiesAppId);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesHomeInfo> list = findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities home infos before and after the current medical facilities home info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the current medical facilities home info
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a medical facilities home info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo[]
			findBygetMedicalFacilitiesById_PrevAndNext(
				long medicalFacilitiesHomeInfoId, long medicalFacilitiesAppId,
				OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeInfoException {

		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo = findByPrimaryKey(
			medicalFacilitiesHomeInfoId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesHomeInfo[] array =
				new MedicalFacilitiesHomeInfoImpl[3];

			array[0] = getBygetMedicalFacilitiesById_PrevAndNext(
				session, medicalFacilitiesHomeInfo, medicalFacilitiesAppId,
				orderByComparator, true);

			array[1] = medicalFacilitiesHomeInfo;

			array[2] = getBygetMedicalFacilitiesById_PrevAndNext(
				session, medicalFacilitiesHomeInfo, medicalFacilitiesAppId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MedicalFacilitiesHomeInfo
		getBygetMedicalFacilitiesById_PrevAndNext(
			Session session,
			MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo,
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MEDICALFACILITIESHOMEINFO_WHERE);

		sb.append(
			_FINDER_COLUMN_GETMEDICALFACILITIESBYID_MEDICALFACILITIESAPPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MedicalFacilitiesHomeInfoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(medicalFacilitiesAppId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						medicalFacilitiesHomeInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesHomeInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities home infos where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 */
	@Override
	public void removeBygetMedicalFacilitiesById(long medicalFacilitiesAppId) {
		for (MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo :
				findBygetMedicalFacilitiesById(
					medicalFacilitiesAppId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(medicalFacilitiesHomeInfo);
		}
	}

	/**
	 * Returns the number of medical facilities home infos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities home infos
	 */
	@Override
	public int countBygetMedicalFacilitiesById(long medicalFacilitiesAppId) {
		FinderPath finderPath = _finderPathCountBygetMedicalFacilitiesById;

		Object[] finderArgs = new Object[] {medicalFacilitiesAppId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESHOMEINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMEDICALFACILITIESBYID_MEDICALFACILITIESAPPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalFacilitiesAppId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETMEDICALFACILITIESBYID_MEDICALFACILITIESAPPID_2 =
			"medicalFacilitiesHomeInfo.medicalFacilitiesAppId = ?";

	private FinderPath _finderPathFetchBygetMedicalFacilities_ByAppId;
	private FinderPath _finderPathCountBygetMedicalFacilities_ByAppId;

	/**
	 * Returns the medical facilities home info where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalFacilitiesHomeInfoException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo findBygetMedicalFacilities_ByAppId(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesHomeInfoException {

		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo =
			fetchBygetMedicalFacilities_ByAppId(medicalFacilitiesAppId);

		if (medicalFacilitiesHomeInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("medicalFacilitiesAppId=");
			sb.append(medicalFacilitiesAppId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalFacilitiesHomeInfoException(sb.toString());
		}

		return medicalFacilitiesHomeInfo;
	}

	/**
	 * Returns the medical facilities home info where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo fetchBygetMedicalFacilities_ByAppId(
		long medicalFacilitiesAppId) {

		return fetchBygetMedicalFacilities_ByAppId(
			medicalFacilitiesAppId, true);
	}

	/**
	 * Returns the medical facilities home info where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo fetchBygetMedicalFacilities_ByAppId(
		long medicalFacilitiesAppId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {medicalFacilitiesAppId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMedicalFacilities_ByAppId, finderArgs,
				this);
		}

		if (result instanceof MedicalFacilitiesHomeInfo) {
			MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo =
				(MedicalFacilitiesHomeInfo)result;

			if (medicalFacilitiesAppId !=
					medicalFacilitiesHomeInfo.getMedicalFacilitiesAppId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MEDICALFACILITIESHOMEINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMEDICALFACILITIES_BYAPPID_MEDICALFACILITIESAPPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalFacilitiesAppId);

				List<MedicalFacilitiesHomeInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMedicalFacilities_ByAppId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									medicalFacilitiesAppId
								};
							}

							_log.warn(
								"MedicalFacilitiesHomeInfoPersistenceImpl.fetchBygetMedicalFacilities_ByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo =
						list.get(0);

					result = medicalFacilitiesHomeInfo;

					cacheResult(medicalFacilitiesHomeInfo);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (MedicalFacilitiesHomeInfo)result;
		}
	}

	/**
	 * Removes the medical facilities home info where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical facilities home info that was removed
	 */
	@Override
	public MedicalFacilitiesHomeInfo removeBygetMedicalFacilities_ByAppId(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesHomeInfoException {

		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo =
			findBygetMedicalFacilities_ByAppId(medicalFacilitiesAppId);

		return remove(medicalFacilitiesHomeInfo);
	}

	/**
	 * Returns the number of medical facilities home infos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities home infos
	 */
	@Override
	public int countBygetMedicalFacilities_ByAppId(
		long medicalFacilitiesAppId) {

		FinderPath finderPath = _finderPathCountBygetMedicalFacilities_ByAppId;

		Object[] finderArgs = new Object[] {medicalFacilitiesAppId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESHOMEINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMEDICALFACILITIES_BYAPPID_MEDICALFACILITIESAPPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalFacilitiesAppId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETMEDICALFACILITIES_BYAPPID_MEDICALFACILITIESAPPID_2 =
			"medicalFacilitiesHomeInfo.medicalFacilitiesAppId = ?";

	public MedicalFacilitiesHomeInfoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(MedicalFacilitiesHomeInfo.class);

		setModelImplClass(MedicalFacilitiesHomeInfoImpl.class);
		setModelPKClass(long.class);

		setTable(MedicalFacilitiesHomeInfoTable.INSTANCE);
	}

	/**
	 * Caches the medical facilities home info in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesHomeInfo the medical facilities home info
	 */
	@Override
	public void cacheResult(
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo) {

		entityCache.putResult(
			MedicalFacilitiesHomeInfoImpl.class,
			medicalFacilitiesHomeInfo.getPrimaryKey(),
			medicalFacilitiesHomeInfo);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				medicalFacilitiesHomeInfo.getUuid(),
				medicalFacilitiesHomeInfo.getGroupId()
			},
			medicalFacilitiesHomeInfo);

		finderCache.putResult(
			_finderPathFetchBygetMedicalFacilities_ByAppId,
			new Object[] {
				medicalFacilitiesHomeInfo.getMedicalFacilitiesAppId()
			},
			medicalFacilitiesHomeInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the medical facilities home infos in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesHomeInfos the medical facilities home infos
	 */
	@Override
	public void cacheResult(
		List<MedicalFacilitiesHomeInfo> medicalFacilitiesHomeInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (medicalFacilitiesHomeInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo :
				medicalFacilitiesHomeInfos) {

			if (entityCache.getResult(
					MedicalFacilitiesHomeInfoImpl.class,
					medicalFacilitiesHomeInfo.getPrimaryKey()) == null) {

				cacheResult(medicalFacilitiesHomeInfo);
			}
		}
	}

	/**
	 * Clears the cache for all medical facilities home infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MedicalFacilitiesHomeInfoImpl.class);

		finderCache.clearCache(MedicalFacilitiesHomeInfoImpl.class);
	}

	/**
	 * Clears the cache for the medical facilities home info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo) {

		entityCache.removeResult(
			MedicalFacilitiesHomeInfoImpl.class, medicalFacilitiesHomeInfo);
	}

	@Override
	public void clearCache(
		List<MedicalFacilitiesHomeInfo> medicalFacilitiesHomeInfos) {

		for (MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo :
				medicalFacilitiesHomeInfos) {

			entityCache.removeResult(
				MedicalFacilitiesHomeInfoImpl.class, medicalFacilitiesHomeInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MedicalFacilitiesHomeInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MedicalFacilitiesHomeInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MedicalFacilitiesHomeInfoModelImpl medicalFacilitiesHomeInfoModelImpl) {

		Object[] args = new Object[] {
			medicalFacilitiesHomeInfoModelImpl.getUuid(),
			medicalFacilitiesHomeInfoModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, medicalFacilitiesHomeInfoModelImpl);

		args = new Object[] {
			medicalFacilitiesHomeInfoModelImpl.getMedicalFacilitiesAppId()
		};

		finderCache.putResult(
			_finderPathCountBygetMedicalFacilities_ByAppId, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMedicalFacilities_ByAppId, args,
			medicalFacilitiesHomeInfoModelImpl);
	}

	/**
	 * Creates a new medical facilities home info with the primary key. Does not add the medical facilities home info to the database.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key for the new medical facilities home info
	 * @return the new medical facilities home info
	 */
	@Override
	public MedicalFacilitiesHomeInfo create(long medicalFacilitiesHomeInfoId) {
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo =
			new MedicalFacilitiesHomeInfoImpl();

		medicalFacilitiesHomeInfo.setNew(true);
		medicalFacilitiesHomeInfo.setPrimaryKey(medicalFacilitiesHomeInfoId);

		String uuid = PortalUUIDUtil.generate();

		medicalFacilitiesHomeInfo.setUuid(uuid);

		medicalFacilitiesHomeInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return medicalFacilitiesHomeInfo;
	}

	/**
	 * Removes the medical facilities home info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the medical facilities home info
	 * @return the medical facilities home info that was removed
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a medical facilities home info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo remove(long medicalFacilitiesHomeInfoId)
		throws NoSuchMedicalFacilitiesHomeInfoException {

		return remove((Serializable)medicalFacilitiesHomeInfoId);
	}

	/**
	 * Removes the medical facilities home info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the medical facilities home info
	 * @return the medical facilities home info that was removed
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a medical facilities home info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo remove(Serializable primaryKey)
		throws NoSuchMedicalFacilitiesHomeInfoException {

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo =
				(MedicalFacilitiesHomeInfo)session.get(
					MedicalFacilitiesHomeInfoImpl.class, primaryKey);

			if (medicalFacilitiesHomeInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMedicalFacilitiesHomeInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(medicalFacilitiesHomeInfo);
		}
		catch (NoSuchMedicalFacilitiesHomeInfoException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected MedicalFacilitiesHomeInfo removeImpl(
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(medicalFacilitiesHomeInfo)) {
				medicalFacilitiesHomeInfo =
					(MedicalFacilitiesHomeInfo)session.get(
						MedicalFacilitiesHomeInfoImpl.class,
						medicalFacilitiesHomeInfo.getPrimaryKeyObj());
			}

			if (medicalFacilitiesHomeInfo != null) {
				session.delete(medicalFacilitiesHomeInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (medicalFacilitiesHomeInfo != null) {
			clearCache(medicalFacilitiesHomeInfo);
		}

		return medicalFacilitiesHomeInfo;
	}

	@Override
	public MedicalFacilitiesHomeInfo updateImpl(
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo) {

		boolean isNew = medicalFacilitiesHomeInfo.isNew();

		if (!(medicalFacilitiesHomeInfo instanceof
				MedicalFacilitiesHomeInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(medicalFacilitiesHomeInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					medicalFacilitiesHomeInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in medicalFacilitiesHomeInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MedicalFacilitiesHomeInfo implementation " +
					medicalFacilitiesHomeInfo.getClass());
		}

		MedicalFacilitiesHomeInfoModelImpl medicalFacilitiesHomeInfoModelImpl =
			(MedicalFacilitiesHomeInfoModelImpl)medicalFacilitiesHomeInfo;

		if (Validator.isNull(medicalFacilitiesHomeInfo.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			medicalFacilitiesHomeInfo.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (medicalFacilitiesHomeInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				medicalFacilitiesHomeInfo.setCreateDate(date);
			}
			else {
				medicalFacilitiesHomeInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!medicalFacilitiesHomeInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				medicalFacilitiesHomeInfo.setModifiedDate(date);
			}
			else {
				medicalFacilitiesHomeInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(medicalFacilitiesHomeInfo);
			}
			else {
				medicalFacilitiesHomeInfo =
					(MedicalFacilitiesHomeInfo)session.merge(
						medicalFacilitiesHomeInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MedicalFacilitiesHomeInfoImpl.class,
			medicalFacilitiesHomeInfoModelImpl, false, true);

		cacheUniqueFindersCache(medicalFacilitiesHomeInfoModelImpl);

		if (isNew) {
			medicalFacilitiesHomeInfo.setNew(false);
		}

		medicalFacilitiesHomeInfo.resetOriginalValues();

		return medicalFacilitiesHomeInfo;
	}

	/**
	 * Returns the medical facilities home info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the medical facilities home info
	 * @return the medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a medical facilities home info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMedicalFacilitiesHomeInfoException {

		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo = fetchByPrimaryKey(
			primaryKey);

		if (medicalFacilitiesHomeInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMedicalFacilitiesHomeInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return medicalFacilitiesHomeInfo;
	}

	/**
	 * Returns the medical facilities home info with the primary key or throws a <code>NoSuchMedicalFacilitiesHomeInfoException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the medical facilities home info
	 * @return the medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a medical facilities home info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo findByPrimaryKey(
			long medicalFacilitiesHomeInfoId)
		throws NoSuchMedicalFacilitiesHomeInfoException {

		return findByPrimaryKey((Serializable)medicalFacilitiesHomeInfoId);
	}

	/**
	 * Returns the medical facilities home info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the medical facilities home info
	 * @return the medical facilities home info, or <code>null</code> if a medical facilities home info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo fetchByPrimaryKey(
		long medicalFacilitiesHomeInfoId) {

		return fetchByPrimaryKey((Serializable)medicalFacilitiesHomeInfoId);
	}

	/**
	 * Returns all the medical facilities home infos.
	 *
	 * @return the medical facilities home infos
	 */
	@Override
	public List<MedicalFacilitiesHomeInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities home infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @return the range of medical facilities home infos
	 */
	@Override
	public List<MedicalFacilitiesHomeInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities home infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities home infos
	 */
	@Override
	public List<MedicalFacilitiesHomeInfo> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities home infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities home infos
	 */
	@Override
	public List<MedicalFacilitiesHomeInfo> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<MedicalFacilitiesHomeInfo> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesHomeInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MEDICALFACILITIESHOMEINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MEDICALFACILITIESHOMEINFO;

				sql = sql.concat(
					MedicalFacilitiesHomeInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MedicalFacilitiesHomeInfo>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the medical facilities home infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo : findAll()) {
			remove(medicalFacilitiesHomeInfo);
		}
	}

	/**
	 * Returns the number of medical facilities home infos.
	 *
	 * @return the number of medical facilities home infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_MEDICALFACILITIESHOMEINFO);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "medicalFacilitiesHomeInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MEDICALFACILITIESHOMEINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MedicalFacilitiesHomeInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the medical facilities home info persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_finderPathWithPaginationFindBygetMedicalFacilitiesById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetMedicalFacilitiesById",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"medicalFacilitiesAppId"}, true);

		_finderPathWithoutPaginationFindBygetMedicalFacilitiesById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetMedicalFacilitiesById",
				new String[] {Long.class.getName()},
				new String[] {"medicalFacilitiesAppId"}, true);

		_finderPathCountBygetMedicalFacilitiesById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedicalFacilitiesById",
			new String[] {Long.class.getName()},
			new String[] {"medicalFacilitiesAppId"}, false);

		_finderPathFetchBygetMedicalFacilities_ByAppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMedicalFacilities_ByAppId",
			new String[] {Long.class.getName()},
			new String[] {"medicalFacilitiesAppId"}, true);

		_finderPathCountBygetMedicalFacilities_ByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedicalFacilities_ByAppId",
			new String[] {Long.class.getName()},
			new String[] {"medicalFacilitiesAppId"}, false);

		MedicalFacilitiesHomeInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MedicalFacilitiesHomeInfoUtil.setPersistence(null);

		entityCache.removeCache(MedicalFacilitiesHomeInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = MEDICAL_FACILITIESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MEDICAL_FACILITIESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MEDICAL_FACILITIESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MEDICALFACILITIESHOMEINFO =
		"SELECT medicalFacilitiesHomeInfo FROM MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo";

	private static final String _SQL_SELECT_MEDICALFACILITIESHOMEINFO_WHERE =
		"SELECT medicalFacilitiesHomeInfo FROM MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo WHERE ";

	private static final String _SQL_COUNT_MEDICALFACILITIESHOMEINFO =
		"SELECT COUNT(medicalFacilitiesHomeInfo) FROM MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo";

	private static final String _SQL_COUNT_MEDICALFACILITIESHOMEINFO_WHERE =
		"SELECT COUNT(medicalFacilitiesHomeInfo) FROM MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"medicalFacilitiesHomeInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MedicalFacilitiesHomeInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MedicalFacilitiesHomeInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MedicalFacilitiesHomeInfoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}