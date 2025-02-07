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

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFacilitiesSignInfoException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesSignInfo;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesSignInfoTable;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesSignInfoImpl;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesSignInfoModelImpl;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesSignInfoPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesSignInfoUtil;
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
 * The persistence implementation for the medical facilities sign info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MedicalFacilitiesSignInfoPersistence.class)
public class MedicalFacilitiesSignInfoPersistenceImpl
	extends BasePersistenceImpl<MedicalFacilitiesSignInfo>
	implements MedicalFacilitiesSignInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MedicalFacilitiesSignInfoUtil</code> to access the medical facilities sign info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MedicalFacilitiesSignInfoImpl.class.getName();

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
	 * Returns all the medical facilities sign infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities sign infos
	 */
	@Override
	public List<MedicalFacilitiesSignInfo> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities sign infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @return the range of matching medical facilities sign infos
	 */
	@Override
	public List<MedicalFacilitiesSignInfo> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities sign infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities sign infos
	 */
	@Override
	public List<MedicalFacilitiesSignInfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities sign infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities sign infos
	 */
	@Override
	public List<MedicalFacilitiesSignInfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator,
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

		List<MedicalFacilitiesSignInfo> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesSignInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesSignInfo medicalFacilitiesSignInfo :
						list) {

					if (!uuid.equals(medicalFacilitiesSignInfo.getUuid())) {
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

			sb.append(_SQL_SELECT_MEDICALFACILITIESSIGNINFO_WHERE);

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
				sb.append(MedicalFacilitiesSignInfoModelImpl.ORDER_BY_JPQL);
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

				list = (List<MedicalFacilitiesSignInfo>)QueryUtil.list(
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
	 * Returns the first medical facilities sign info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a matching medical facilities sign info could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo findByUuid_First(
			String uuid,
			OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesSignInfoException {

		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo = fetchByUuid_First(
			uuid, orderByComparator);

		if (medicalFacilitiesSignInfo != null) {
			return medicalFacilitiesSignInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesSignInfoException(sb.toString());
	}

	/**
	 * Returns the first medical facilities sign info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo fetchByUuid_First(
		String uuid,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator) {

		List<MedicalFacilitiesSignInfo> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities sign info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a matching medical facilities sign info could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo findByUuid_Last(
			String uuid,
			OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesSignInfoException {

		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo = fetchByUuid_Last(
			uuid, orderByComparator);

		if (medicalFacilitiesSignInfo != null) {
			return medicalFacilitiesSignInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesSignInfoException(sb.toString());
	}

	/**
	 * Returns the last medical facilities sign info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo fetchByUuid_Last(
		String uuid,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesSignInfo> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities sign infos before and after the current medical facilities sign info in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesSignInfoId the primary key of the current medical facilities sign info
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a medical facilities sign info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo[] findByUuid_PrevAndNext(
			long medicalFacilitiesSignInfoId, String uuid,
			OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesSignInfoException {

		uuid = Objects.toString(uuid, "");

		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo = findByPrimaryKey(
			medicalFacilitiesSignInfoId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesSignInfo[] array =
				new MedicalFacilitiesSignInfoImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, medicalFacilitiesSignInfo, uuid, orderByComparator,
				true);

			array[1] = medicalFacilitiesSignInfo;

			array[2] = getByUuid_PrevAndNext(
				session, medicalFacilitiesSignInfo, uuid, orderByComparator,
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

	protected MedicalFacilitiesSignInfo getByUuid_PrevAndNext(
		Session session, MedicalFacilitiesSignInfo medicalFacilitiesSignInfo,
		String uuid,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALFACILITIESSIGNINFO_WHERE);

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
			sb.append(MedicalFacilitiesSignInfoModelImpl.ORDER_BY_JPQL);
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
						medicalFacilitiesSignInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesSignInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities sign infos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (MedicalFacilitiesSignInfo medicalFacilitiesSignInfo :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(medicalFacilitiesSignInfo);
		}
	}

	/**
	 * Returns the number of medical facilities sign infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities sign infos
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESSIGNINFO_WHERE);

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
		"medicalFacilitiesSignInfo.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(medicalFacilitiesSignInfo.uuid IS NULL OR medicalFacilitiesSignInfo.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the medical facilities sign info where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesSignInfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a matching medical facilities sign info could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesSignInfoException {

		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo = fetchByUUID_G(
			uuid, groupId);

		if (medicalFacilitiesSignInfo == null) {
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

			throw new NoSuchMedicalFacilitiesSignInfoException(sb.toString());
		}

		return medicalFacilitiesSignInfo;
	}

	/**
	 * Returns the medical facilities sign info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the medical facilities sign info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo fetchByUUID_G(
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

		if (result instanceof MedicalFacilitiesSignInfo) {
			MedicalFacilitiesSignInfo medicalFacilitiesSignInfo =
				(MedicalFacilitiesSignInfo)result;

			if (!Objects.equals(uuid, medicalFacilitiesSignInfo.getUuid()) ||
				(groupId != medicalFacilitiesSignInfo.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MEDICALFACILITIESSIGNINFO_WHERE);

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

				List<MedicalFacilitiesSignInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					MedicalFacilitiesSignInfo medicalFacilitiesSignInfo =
						list.get(0);

					result = medicalFacilitiesSignInfo;

					cacheResult(medicalFacilitiesSignInfo);
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
			return (MedicalFacilitiesSignInfo)result;
		}
	}

	/**
	 * Removes the medical facilities sign info where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities sign info that was removed
	 */
	@Override
	public MedicalFacilitiesSignInfo removeByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesSignInfoException {

		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo = findByUUID_G(
			uuid, groupId);

		return remove(medicalFacilitiesSignInfo);
	}

	/**
	 * Returns the number of medical facilities sign infos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities sign infos
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALFACILITIESSIGNINFO_WHERE);

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
		"medicalFacilitiesSignInfo.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(medicalFacilitiesSignInfo.uuid IS NULL OR medicalFacilitiesSignInfo.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"medicalFacilitiesSignInfo.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the medical facilities sign infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities sign infos
	 */
	@Override
	public List<MedicalFacilitiesSignInfo> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities sign infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @return the range of matching medical facilities sign infos
	 */
	@Override
	public List<MedicalFacilitiesSignInfo> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities sign infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities sign infos
	 */
	@Override
	public List<MedicalFacilitiesSignInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities sign infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities sign infos
	 */
	@Override
	public List<MedicalFacilitiesSignInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator,
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

		List<MedicalFacilitiesSignInfo> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesSignInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesSignInfo medicalFacilitiesSignInfo :
						list) {

					if (!uuid.equals(medicalFacilitiesSignInfo.getUuid()) ||
						(companyId !=
							medicalFacilitiesSignInfo.getCompanyId())) {

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

			sb.append(_SQL_SELECT_MEDICALFACILITIESSIGNINFO_WHERE);

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
				sb.append(MedicalFacilitiesSignInfoModelImpl.ORDER_BY_JPQL);
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

				list = (List<MedicalFacilitiesSignInfo>)QueryUtil.list(
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
	 * Returns the first medical facilities sign info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a matching medical facilities sign info could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesSignInfoException {

		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (medicalFacilitiesSignInfo != null) {
			return medicalFacilitiesSignInfo;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesSignInfoException(sb.toString());
	}

	/**
	 * Returns the first medical facilities sign info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator) {

		List<MedicalFacilitiesSignInfo> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities sign info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a matching medical facilities sign info could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesSignInfoException {

		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (medicalFacilitiesSignInfo != null) {
			return medicalFacilitiesSignInfo;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesSignInfoException(sb.toString());
	}

	/**
	 * Returns the last medical facilities sign info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesSignInfo> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities sign infos before and after the current medical facilities sign info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesSignInfoId the primary key of the current medical facilities sign info
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a medical facilities sign info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesSignInfoId, String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesSignInfoException {

		uuid = Objects.toString(uuid, "");

		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo = findByPrimaryKey(
			medicalFacilitiesSignInfoId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesSignInfo[] array =
				new MedicalFacilitiesSignInfoImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, medicalFacilitiesSignInfo, uuid, companyId,
				orderByComparator, true);

			array[1] = medicalFacilitiesSignInfo;

			array[2] = getByUuid_C_PrevAndNext(
				session, medicalFacilitiesSignInfo, uuid, companyId,
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

	protected MedicalFacilitiesSignInfo getByUuid_C_PrevAndNext(
		Session session, MedicalFacilitiesSignInfo medicalFacilitiesSignInfo,
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALFACILITIESSIGNINFO_WHERE);

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
			sb.append(MedicalFacilitiesSignInfoModelImpl.ORDER_BY_JPQL);
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
						medicalFacilitiesSignInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesSignInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities sign infos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (MedicalFacilitiesSignInfo medicalFacilitiesSignInfo :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(medicalFacilitiesSignInfo);
		}
	}

	/**
	 * Returns the number of medical facilities sign infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities sign infos
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALFACILITIESSIGNINFO_WHERE);

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
		"medicalFacilitiesSignInfo.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(medicalFacilitiesSignInfo.uuid IS NULL OR medicalFacilitiesSignInfo.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"medicalFacilitiesSignInfo.companyId = ?";

	private FinderPath _finderPathFetchBygetMedicalFacilitiesById;
	private FinderPath _finderPathCountBygetMedicalFacilitiesById;

	/**
	 * Returns the medical facilities sign info where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalFacilitiesSignInfoException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a matching medical facilities sign info could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesSignInfoException {

		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo =
			fetchBygetMedicalFacilitiesById(medicalFacilitiesAppId);

		if (medicalFacilitiesSignInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("medicalFacilitiesAppId=");
			sb.append(medicalFacilitiesAppId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMedicalFacilitiesSignInfoException(sb.toString());
		}

		return medicalFacilitiesSignInfo;
	}

	/**
	 * Returns the medical facilities sign info where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo fetchBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		return fetchBygetMedicalFacilitiesById(medicalFacilitiesAppId, true);
	}

	/**
	 * Returns the medical facilities sign info where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo fetchBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {medicalFacilitiesAppId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMedicalFacilitiesById, finderArgs, this);
		}

		if (result instanceof MedicalFacilitiesSignInfo) {
			MedicalFacilitiesSignInfo medicalFacilitiesSignInfo =
				(MedicalFacilitiesSignInfo)result;

			if (medicalFacilitiesAppId !=
					medicalFacilitiesSignInfo.getMedicalFacilitiesAppId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MEDICALFACILITIESSIGNINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMEDICALFACILITIESBYID_MEDICALFACILITIESAPPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalFacilitiesAppId);

				List<MedicalFacilitiesSignInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMedicalFacilitiesById,
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
								"MedicalFacilitiesSignInfoPersistenceImpl.fetchBygetMedicalFacilitiesById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MedicalFacilitiesSignInfo medicalFacilitiesSignInfo =
						list.get(0);

					result = medicalFacilitiesSignInfo;

					cacheResult(medicalFacilitiesSignInfo);
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
			return (MedicalFacilitiesSignInfo)result;
		}
	}

	/**
	 * Removes the medical facilities sign info where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical facilities sign info that was removed
	 */
	@Override
	public MedicalFacilitiesSignInfo removeBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesSignInfoException {

		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo =
			findBygetMedicalFacilitiesById(medicalFacilitiesAppId);

		return remove(medicalFacilitiesSignInfo);
	}

	/**
	 * Returns the number of medical facilities sign infos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities sign infos
	 */
	@Override
	public int countBygetMedicalFacilitiesById(long medicalFacilitiesAppId) {
		FinderPath finderPath = _finderPathCountBygetMedicalFacilitiesById;

		Object[] finderArgs = new Object[] {medicalFacilitiesAppId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESSIGNINFO_WHERE);

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
			"medicalFacilitiesSignInfo.medicalFacilitiesAppId = ?";

	public MedicalFacilitiesSignInfoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("number", "number_");

		setDBColumnNames(dbColumnNames);

		setModelClass(MedicalFacilitiesSignInfo.class);

		setModelImplClass(MedicalFacilitiesSignInfoImpl.class);
		setModelPKClass(long.class);

		setTable(MedicalFacilitiesSignInfoTable.INSTANCE);
	}

	/**
	 * Caches the medical facilities sign info in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesSignInfo the medical facilities sign info
	 */
	@Override
	public void cacheResult(
		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo) {

		entityCache.putResult(
			MedicalFacilitiesSignInfoImpl.class,
			medicalFacilitiesSignInfo.getPrimaryKey(),
			medicalFacilitiesSignInfo);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				medicalFacilitiesSignInfo.getUuid(),
				medicalFacilitiesSignInfo.getGroupId()
			},
			medicalFacilitiesSignInfo);

		finderCache.putResult(
			_finderPathFetchBygetMedicalFacilitiesById,
			new Object[] {
				medicalFacilitiesSignInfo.getMedicalFacilitiesAppId()
			},
			medicalFacilitiesSignInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the medical facilities sign infos in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesSignInfos the medical facilities sign infos
	 */
	@Override
	public void cacheResult(
		List<MedicalFacilitiesSignInfo> medicalFacilitiesSignInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (medicalFacilitiesSignInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MedicalFacilitiesSignInfo medicalFacilitiesSignInfo :
				medicalFacilitiesSignInfos) {

			if (entityCache.getResult(
					MedicalFacilitiesSignInfoImpl.class,
					medicalFacilitiesSignInfo.getPrimaryKey()) == null) {

				cacheResult(medicalFacilitiesSignInfo);
			}
		}
	}

	/**
	 * Clears the cache for all medical facilities sign infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MedicalFacilitiesSignInfoImpl.class);

		finderCache.clearCache(MedicalFacilitiesSignInfoImpl.class);
	}

	/**
	 * Clears the cache for the medical facilities sign info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo) {

		entityCache.removeResult(
			MedicalFacilitiesSignInfoImpl.class, medicalFacilitiesSignInfo);
	}

	@Override
	public void clearCache(
		List<MedicalFacilitiesSignInfo> medicalFacilitiesSignInfos) {

		for (MedicalFacilitiesSignInfo medicalFacilitiesSignInfo :
				medicalFacilitiesSignInfos) {

			entityCache.removeResult(
				MedicalFacilitiesSignInfoImpl.class, medicalFacilitiesSignInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MedicalFacilitiesSignInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MedicalFacilitiesSignInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MedicalFacilitiesSignInfoModelImpl medicalFacilitiesSignInfoModelImpl) {

		Object[] args = new Object[] {
			medicalFacilitiesSignInfoModelImpl.getUuid(),
			medicalFacilitiesSignInfoModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, medicalFacilitiesSignInfoModelImpl);

		args = new Object[] {
			medicalFacilitiesSignInfoModelImpl.getMedicalFacilitiesAppId()
		};

		finderCache.putResult(
			_finderPathCountBygetMedicalFacilitiesById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMedicalFacilitiesById, args,
			medicalFacilitiesSignInfoModelImpl);
	}

	/**
	 * Creates a new medical facilities sign info with the primary key. Does not add the medical facilities sign info to the database.
	 *
	 * @param medicalFacilitiesSignInfoId the primary key for the new medical facilities sign info
	 * @return the new medical facilities sign info
	 */
	@Override
	public MedicalFacilitiesSignInfo create(long medicalFacilitiesSignInfoId) {
		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo =
			new MedicalFacilitiesSignInfoImpl();

		medicalFacilitiesSignInfo.setNew(true);
		medicalFacilitiesSignInfo.setPrimaryKey(medicalFacilitiesSignInfoId);

		String uuid = PortalUUIDUtil.generate();

		medicalFacilitiesSignInfo.setUuid(uuid);

		medicalFacilitiesSignInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return medicalFacilitiesSignInfo;
	}

	/**
	 * Removes the medical facilities sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesSignInfoId the primary key of the medical facilities sign info
	 * @return the medical facilities sign info that was removed
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a medical facilities sign info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo remove(long medicalFacilitiesSignInfoId)
		throws NoSuchMedicalFacilitiesSignInfoException {

		return remove((Serializable)medicalFacilitiesSignInfoId);
	}

	/**
	 * Removes the medical facilities sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the medical facilities sign info
	 * @return the medical facilities sign info that was removed
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a medical facilities sign info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo remove(Serializable primaryKey)
		throws NoSuchMedicalFacilitiesSignInfoException {

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesSignInfo medicalFacilitiesSignInfo =
				(MedicalFacilitiesSignInfo)session.get(
					MedicalFacilitiesSignInfoImpl.class, primaryKey);

			if (medicalFacilitiesSignInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMedicalFacilitiesSignInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(medicalFacilitiesSignInfo);
		}
		catch (NoSuchMedicalFacilitiesSignInfoException noSuchEntityException) {
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
	protected MedicalFacilitiesSignInfo removeImpl(
		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(medicalFacilitiesSignInfo)) {
				medicalFacilitiesSignInfo =
					(MedicalFacilitiesSignInfo)session.get(
						MedicalFacilitiesSignInfoImpl.class,
						medicalFacilitiesSignInfo.getPrimaryKeyObj());
			}

			if (medicalFacilitiesSignInfo != null) {
				session.delete(medicalFacilitiesSignInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (medicalFacilitiesSignInfo != null) {
			clearCache(medicalFacilitiesSignInfo);
		}

		return medicalFacilitiesSignInfo;
	}

	@Override
	public MedicalFacilitiesSignInfo updateImpl(
		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo) {

		boolean isNew = medicalFacilitiesSignInfo.isNew();

		if (!(medicalFacilitiesSignInfo instanceof
				MedicalFacilitiesSignInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(medicalFacilitiesSignInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					medicalFacilitiesSignInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in medicalFacilitiesSignInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MedicalFacilitiesSignInfo implementation " +
					medicalFacilitiesSignInfo.getClass());
		}

		MedicalFacilitiesSignInfoModelImpl medicalFacilitiesSignInfoModelImpl =
			(MedicalFacilitiesSignInfoModelImpl)medicalFacilitiesSignInfo;

		if (Validator.isNull(medicalFacilitiesSignInfo.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			medicalFacilitiesSignInfo.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (medicalFacilitiesSignInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				medicalFacilitiesSignInfo.setCreateDate(date);
			}
			else {
				medicalFacilitiesSignInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!medicalFacilitiesSignInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				medicalFacilitiesSignInfo.setModifiedDate(date);
			}
			else {
				medicalFacilitiesSignInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(medicalFacilitiesSignInfo);
			}
			else {
				medicalFacilitiesSignInfo =
					(MedicalFacilitiesSignInfo)session.merge(
						medicalFacilitiesSignInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MedicalFacilitiesSignInfoImpl.class,
			medicalFacilitiesSignInfoModelImpl, false, true);

		cacheUniqueFindersCache(medicalFacilitiesSignInfoModelImpl);

		if (isNew) {
			medicalFacilitiesSignInfo.setNew(false);
		}

		medicalFacilitiesSignInfo.resetOriginalValues();

		return medicalFacilitiesSignInfo;
	}

	/**
	 * Returns the medical facilities sign info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the medical facilities sign info
	 * @return the medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a medical facilities sign info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMedicalFacilitiesSignInfoException {

		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo = fetchByPrimaryKey(
			primaryKey);

		if (medicalFacilitiesSignInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMedicalFacilitiesSignInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return medicalFacilitiesSignInfo;
	}

	/**
	 * Returns the medical facilities sign info with the primary key or throws a <code>NoSuchMedicalFacilitiesSignInfoException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesSignInfoId the primary key of the medical facilities sign info
	 * @return the medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a medical facilities sign info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo findByPrimaryKey(
			long medicalFacilitiesSignInfoId)
		throws NoSuchMedicalFacilitiesSignInfoException {

		return findByPrimaryKey((Serializable)medicalFacilitiesSignInfoId);
	}

	/**
	 * Returns the medical facilities sign info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesSignInfoId the primary key of the medical facilities sign info
	 * @return the medical facilities sign info, or <code>null</code> if a medical facilities sign info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesSignInfo fetchByPrimaryKey(
		long medicalFacilitiesSignInfoId) {

		return fetchByPrimaryKey((Serializable)medicalFacilitiesSignInfoId);
	}

	/**
	 * Returns all the medical facilities sign infos.
	 *
	 * @return the medical facilities sign infos
	 */
	@Override
	public List<MedicalFacilitiesSignInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @return the range of medical facilities sign infos
	 */
	@Override
	public List<MedicalFacilitiesSignInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities sign infos
	 */
	@Override
	public List<MedicalFacilitiesSignInfo> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities sign infos
	 */
	@Override
	public List<MedicalFacilitiesSignInfo> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator,
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

		List<MedicalFacilitiesSignInfo> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesSignInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MEDICALFACILITIESSIGNINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MEDICALFACILITIESSIGNINFO;

				sql = sql.concat(
					MedicalFacilitiesSignInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MedicalFacilitiesSignInfo>)QueryUtil.list(
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
	 * Removes all the medical facilities sign infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MedicalFacilitiesSignInfo medicalFacilitiesSignInfo : findAll()) {
			remove(medicalFacilitiesSignInfo);
		}
	}

	/**
	 * Returns the number of medical facilities sign infos.
	 *
	 * @return the number of medical facilities sign infos
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
					_SQL_COUNT_MEDICALFACILITIESSIGNINFO);

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
		return "medicalFacilitiesSignInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MEDICALFACILITIESSIGNINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MedicalFacilitiesSignInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the medical facilities sign info persistence.
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

		_finderPathFetchBygetMedicalFacilitiesById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMedicalFacilitiesById",
			new String[] {Long.class.getName()},
			new String[] {"medicalFacilitiesAppId"}, true);

		_finderPathCountBygetMedicalFacilitiesById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMedicalFacilitiesById",
			new String[] {Long.class.getName()},
			new String[] {"medicalFacilitiesAppId"}, false);

		MedicalFacilitiesSignInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MedicalFacilitiesSignInfoUtil.setPersistence(null);

		entityCache.removeCache(MedicalFacilitiesSignInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_MEDICALFACILITIESSIGNINFO =
		"SELECT medicalFacilitiesSignInfo FROM MedicalFacilitiesSignInfo medicalFacilitiesSignInfo";

	private static final String _SQL_SELECT_MEDICALFACILITIESSIGNINFO_WHERE =
		"SELECT medicalFacilitiesSignInfo FROM MedicalFacilitiesSignInfo medicalFacilitiesSignInfo WHERE ";

	private static final String _SQL_COUNT_MEDICALFACILITIESSIGNINFO =
		"SELECT COUNT(medicalFacilitiesSignInfo) FROM MedicalFacilitiesSignInfo medicalFacilitiesSignInfo";

	private static final String _SQL_COUNT_MEDICALFACILITIESSIGNINFO_WHERE =
		"SELECT COUNT(medicalFacilitiesSignInfo) FROM MedicalFacilitiesSignInfo medicalFacilitiesSignInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"medicalFacilitiesSignInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MedicalFacilitiesSignInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MedicalFacilitiesSignInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MedicalFacilitiesSignInfoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "number"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}