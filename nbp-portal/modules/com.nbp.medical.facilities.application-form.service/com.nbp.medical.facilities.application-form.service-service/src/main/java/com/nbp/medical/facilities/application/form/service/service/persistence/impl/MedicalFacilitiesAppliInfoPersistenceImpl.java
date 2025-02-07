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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFacilitiesAppliInfoException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesAppliInfo;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesAppliInfoTable;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesAppliInfoImpl;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesAppliInfoModelImpl;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesAppliInfoPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesAppliInfoUtil;
import com.nbp.medical.facilities.application.form.service.service.persistence.impl.constants.MEDICAL_FACILITIESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the medical facilities appli info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MedicalFacilitiesAppliInfoPersistence.class)
public class MedicalFacilitiesAppliInfoPersistenceImpl
	extends BasePersistenceImpl<MedicalFacilitiesAppliInfo>
	implements MedicalFacilitiesAppliInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MedicalFacilitiesAppliInfoUtil</code> to access the medical facilities appli info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MedicalFacilitiesAppliInfoImpl.class.getName();

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
	 * Returns all the medical facilities appli infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities appli infos
	 */
	@Override
	public List<MedicalFacilitiesAppliInfo> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities appli infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @return the range of matching medical facilities appli infos
	 */
	@Override
	public List<MedicalFacilitiesAppliInfo> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities appli infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities appli infos
	 */
	@Override
	public List<MedicalFacilitiesAppliInfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities appli infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities appli infos
	 */
	@Override
	public List<MedicalFacilitiesAppliInfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator,
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

		List<MedicalFacilitiesAppliInfo> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesAppliInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo :
						list) {

					if (!uuid.equals(medicalFacilitiesAppliInfo.getUuid())) {
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

			sb.append(_SQL_SELECT_MEDICALFACILITIESAPPLIINFO_WHERE);

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
				sb.append(MedicalFacilitiesAppliInfoModelImpl.ORDER_BY_JPQL);
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

				list = (List<MedicalFacilitiesAppliInfo>)QueryUtil.list(
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
	 * Returns the first medical facilities appli info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo findByUuid_First(
			String uuid,
			OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesAppliInfoException {

		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo =
			fetchByUuid_First(uuid, orderByComparator);

		if (medicalFacilitiesAppliInfo != null) {
			return medicalFacilitiesAppliInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesAppliInfoException(sb.toString());
	}

	/**
	 * Returns the first medical facilities appli info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo fetchByUuid_First(
		String uuid,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		List<MedicalFacilitiesAppliInfo> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities appli info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo findByUuid_Last(
			String uuid,
			OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesAppliInfoException {

		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo =
			fetchByUuid_Last(uuid, orderByComparator);

		if (medicalFacilitiesAppliInfo != null) {
			return medicalFacilitiesAppliInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesAppliInfoException(sb.toString());
	}

	/**
	 * Returns the last medical facilities appli info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo fetchByUuid_Last(
		String uuid,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesAppliInfo> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities appli infos before and after the current medical facilities appli info in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesAppliId the primary key of the current medical facilities appli info
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a medical facilities appli info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo[] findByUuid_PrevAndNext(
			long medicalFacilitiesAppliId, String uuid,
			OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesAppliInfoException {

		uuid = Objects.toString(uuid, "");

		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo =
			findByPrimaryKey(medicalFacilitiesAppliId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesAppliInfo[] array =
				new MedicalFacilitiesAppliInfoImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, medicalFacilitiesAppliInfo, uuid, orderByComparator,
				true);

			array[1] = medicalFacilitiesAppliInfo;

			array[2] = getByUuid_PrevAndNext(
				session, medicalFacilitiesAppliInfo, uuid, orderByComparator,
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

	protected MedicalFacilitiesAppliInfo getByUuid_PrevAndNext(
		Session session, MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo,
		String uuid,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALFACILITIESAPPLIINFO_WHERE);

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
			sb.append(MedicalFacilitiesAppliInfoModelImpl.ORDER_BY_JPQL);
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
						medicalFacilitiesAppliInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesAppliInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities appli infos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(medicalFacilitiesAppliInfo);
		}
	}

	/**
	 * Returns the number of medical facilities appli infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities appli infos
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESAPPLIINFO_WHERE);

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
		"medicalFacilitiesAppliInfo.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(medicalFacilitiesAppliInfo.uuid IS NULL OR medicalFacilitiesAppliInfo.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the medical facilities appli info where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesAppliInfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesAppliInfoException {

		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo = fetchByUUID_G(
			uuid, groupId);

		if (medicalFacilitiesAppliInfo == null) {
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

			throw new NoSuchMedicalFacilitiesAppliInfoException(sb.toString());
		}

		return medicalFacilitiesAppliInfo;
	}

	/**
	 * Returns the medical facilities appli info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the medical facilities appli info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo fetchByUUID_G(
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

		if (result instanceof MedicalFacilitiesAppliInfo) {
			MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo =
				(MedicalFacilitiesAppliInfo)result;

			if (!Objects.equals(uuid, medicalFacilitiesAppliInfo.getUuid()) ||
				(groupId != medicalFacilitiesAppliInfo.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MEDICALFACILITIESAPPLIINFO_WHERE);

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

				List<MedicalFacilitiesAppliInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo =
						list.get(0);

					result = medicalFacilitiesAppliInfo;

					cacheResult(medicalFacilitiesAppliInfo);
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
			return (MedicalFacilitiesAppliInfo)result;
		}
	}

	/**
	 * Removes the medical facilities appli info where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities appli info that was removed
	 */
	@Override
	public MedicalFacilitiesAppliInfo removeByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesAppliInfoException {

		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo = findByUUID_G(
			uuid, groupId);

		return remove(medicalFacilitiesAppliInfo);
	}

	/**
	 * Returns the number of medical facilities appli infos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities appli infos
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALFACILITIESAPPLIINFO_WHERE);

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
		"medicalFacilitiesAppliInfo.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(medicalFacilitiesAppliInfo.uuid IS NULL OR medicalFacilitiesAppliInfo.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"medicalFacilitiesAppliInfo.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the medical facilities appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities appli infos
	 */
	@Override
	public List<MedicalFacilitiesAppliInfo> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @return the range of matching medical facilities appli infos
	 */
	@Override
	public List<MedicalFacilitiesAppliInfo> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities appli infos
	 */
	@Override
	public List<MedicalFacilitiesAppliInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities appli infos
	 */
	@Override
	public List<MedicalFacilitiesAppliInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator,
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

		List<MedicalFacilitiesAppliInfo> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesAppliInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo :
						list) {

					if (!uuid.equals(medicalFacilitiesAppliInfo.getUuid()) ||
						(companyId !=
							medicalFacilitiesAppliInfo.getCompanyId())) {

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

			sb.append(_SQL_SELECT_MEDICALFACILITIESAPPLIINFO_WHERE);

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
				sb.append(MedicalFacilitiesAppliInfoModelImpl.ORDER_BY_JPQL);
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

				list = (List<MedicalFacilitiesAppliInfo>)QueryUtil.list(
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
	 * Returns the first medical facilities appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesAppliInfoException {

		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (medicalFacilitiesAppliInfo != null) {
			return medicalFacilitiesAppliInfo;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesAppliInfoException(sb.toString());
	}

	/**
	 * Returns the first medical facilities appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		List<MedicalFacilitiesAppliInfo> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesAppliInfoException {

		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (medicalFacilitiesAppliInfo != null) {
			return medicalFacilitiesAppliInfo;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesAppliInfoException(sb.toString());
	}

	/**
	 * Returns the last medical facilities appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesAppliInfo> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities appli infos before and after the current medical facilities appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesAppliId the primary key of the current medical facilities appli info
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a medical facilities appli info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesAppliId, String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesAppliInfoException {

		uuid = Objects.toString(uuid, "");

		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo =
			findByPrimaryKey(medicalFacilitiesAppliId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesAppliInfo[] array =
				new MedicalFacilitiesAppliInfoImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, medicalFacilitiesAppliInfo, uuid, companyId,
				orderByComparator, true);

			array[1] = medicalFacilitiesAppliInfo;

			array[2] = getByUuid_C_PrevAndNext(
				session, medicalFacilitiesAppliInfo, uuid, companyId,
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

	protected MedicalFacilitiesAppliInfo getByUuid_C_PrevAndNext(
		Session session, MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo,
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALFACILITIESAPPLIINFO_WHERE);

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
			sb.append(MedicalFacilitiesAppliInfoModelImpl.ORDER_BY_JPQL);
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
						medicalFacilitiesAppliInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesAppliInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities appli infos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(medicalFacilitiesAppliInfo);
		}
	}

	/**
	 * Returns the number of medical facilities appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities appli infos
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALFACILITIESAPPLIINFO_WHERE);

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
		"medicalFacilitiesAppliInfo.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(medicalFacilitiesAppliInfo.uuid IS NULL OR medicalFacilitiesAppliInfo.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"medicalFacilitiesAppliInfo.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMedicalFacilitiesById;
	private FinderPath
		_finderPathWithoutPaginationFindBygetMedicalFacilitiesById;
	private FinderPath _finderPathCountBygetMedicalFacilitiesById;

	/**
	 * Returns all the medical facilities appli infos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities appli infos
	 */
	@Override
	public List<MedicalFacilitiesAppliInfo> findBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		return findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities appli infos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @return the range of matching medical facilities appli infos
	 */
	@Override
	public List<MedicalFacilitiesAppliInfo> findBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, int start, int end) {

		return findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities appli infos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities appli infos
	 */
	@Override
	public List<MedicalFacilitiesAppliInfo> findBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, int start, int end,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		return findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities appli infos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities appli infos
	 */
	@Override
	public List<MedicalFacilitiesAppliInfo> findBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, int start, int end,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator,
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

		List<MedicalFacilitiesAppliInfo> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesAppliInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo :
						list) {

					if (medicalFacilitiesAppId !=
							medicalFacilitiesAppliInfo.
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

			sb.append(_SQL_SELECT_MEDICALFACILITIESAPPLIINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMEDICALFACILITIESBYID_MEDICALFACILITIESAPPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MedicalFacilitiesAppliInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalFacilitiesAppId);

				list = (List<MedicalFacilitiesAppliInfo>)QueryUtil.list(
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
	 * Returns the first medical facilities appli info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo findBygetMedicalFacilitiesById_First(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesAppliInfoException {

		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo =
			fetchBygetMedicalFacilitiesById_First(
				medicalFacilitiesAppId, orderByComparator);

		if (medicalFacilitiesAppliInfo != null) {
			return medicalFacilitiesAppliInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesAppliInfoException(sb.toString());
	}

	/**
	 * Returns the first medical facilities appli info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo fetchBygetMedicalFacilitiesById_First(
		long medicalFacilitiesAppId,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		List<MedicalFacilitiesAppliInfo> list = findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities appli info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo findBygetMedicalFacilitiesById_Last(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesAppliInfoException {

		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo =
			fetchBygetMedicalFacilitiesById_Last(
				medicalFacilitiesAppId, orderByComparator);

		if (medicalFacilitiesAppliInfo != null) {
			return medicalFacilitiesAppliInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesAppliInfoException(sb.toString());
	}

	/**
	 * Returns the last medical facilities appli info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo fetchBygetMedicalFacilitiesById_Last(
		long medicalFacilitiesAppId,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		int count = countBygetMedicalFacilitiesById(medicalFacilitiesAppId);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesAppliInfo> list = findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities appli infos before and after the current medical facilities appli info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppliId the primary key of the current medical facilities appli info
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a medical facilities appli info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo[]
			findBygetMedicalFacilitiesById_PrevAndNext(
				long medicalFacilitiesAppliId, long medicalFacilitiesAppId,
				OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesAppliInfoException {

		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo =
			findByPrimaryKey(medicalFacilitiesAppliId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesAppliInfo[] array =
				new MedicalFacilitiesAppliInfoImpl[3];

			array[0] = getBygetMedicalFacilitiesById_PrevAndNext(
				session, medicalFacilitiesAppliInfo, medicalFacilitiesAppId,
				orderByComparator, true);

			array[1] = medicalFacilitiesAppliInfo;

			array[2] = getBygetMedicalFacilitiesById_PrevAndNext(
				session, medicalFacilitiesAppliInfo, medicalFacilitiesAppId,
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

	protected MedicalFacilitiesAppliInfo
		getBygetMedicalFacilitiesById_PrevAndNext(
			Session session,
			MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo,
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALFACILITIESAPPLIINFO_WHERE);

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
			sb.append(MedicalFacilitiesAppliInfoModelImpl.ORDER_BY_JPQL);
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
						medicalFacilitiesAppliInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesAppliInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities appli infos where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 */
	@Override
	public void removeBygetMedicalFacilitiesById(long medicalFacilitiesAppId) {
		for (MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo :
				findBygetMedicalFacilitiesById(
					medicalFacilitiesAppId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(medicalFacilitiesAppliInfo);
		}
	}

	/**
	 * Returns the number of medical facilities appli infos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities appli infos
	 */
	@Override
	public int countBygetMedicalFacilitiesById(long medicalFacilitiesAppId) {
		FinderPath finderPath = _finderPathCountBygetMedicalFacilitiesById;

		Object[] finderArgs = new Object[] {medicalFacilitiesAppId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESAPPLIINFO_WHERE);

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
			"medicalFacilitiesAppliInfo.medicalFacilitiesAppId = ?";

	public MedicalFacilitiesAppliInfoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(MedicalFacilitiesAppliInfo.class);

		setModelImplClass(MedicalFacilitiesAppliInfoImpl.class);
		setModelPKClass(long.class);

		setTable(MedicalFacilitiesAppliInfoTable.INSTANCE);
	}

	/**
	 * Caches the medical facilities appli info in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesAppliInfo the medical facilities appli info
	 */
	@Override
	public void cacheResult(
		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo) {

		entityCache.putResult(
			MedicalFacilitiesAppliInfoImpl.class,
			medicalFacilitiesAppliInfo.getPrimaryKey(),
			medicalFacilitiesAppliInfo);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				medicalFacilitiesAppliInfo.getUuid(),
				medicalFacilitiesAppliInfo.getGroupId()
			},
			medicalFacilitiesAppliInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the medical facilities appli infos in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesAppliInfos the medical facilities appli infos
	 */
	@Override
	public void cacheResult(
		List<MedicalFacilitiesAppliInfo> medicalFacilitiesAppliInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (medicalFacilitiesAppliInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo :
				medicalFacilitiesAppliInfos) {

			if (entityCache.getResult(
					MedicalFacilitiesAppliInfoImpl.class,
					medicalFacilitiesAppliInfo.getPrimaryKey()) == null) {

				cacheResult(medicalFacilitiesAppliInfo);
			}
		}
	}

	/**
	 * Clears the cache for all medical facilities appli infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MedicalFacilitiesAppliInfoImpl.class);

		finderCache.clearCache(MedicalFacilitiesAppliInfoImpl.class);
	}

	/**
	 * Clears the cache for the medical facilities appli info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo) {

		entityCache.removeResult(
			MedicalFacilitiesAppliInfoImpl.class, medicalFacilitiesAppliInfo);
	}

	@Override
	public void clearCache(
		List<MedicalFacilitiesAppliInfo> medicalFacilitiesAppliInfos) {

		for (MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo :
				medicalFacilitiesAppliInfos) {

			entityCache.removeResult(
				MedicalFacilitiesAppliInfoImpl.class,
				medicalFacilitiesAppliInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MedicalFacilitiesAppliInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MedicalFacilitiesAppliInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MedicalFacilitiesAppliInfoModelImpl
			medicalFacilitiesAppliInfoModelImpl) {

		Object[] args = new Object[] {
			medicalFacilitiesAppliInfoModelImpl.getUuid(),
			medicalFacilitiesAppliInfoModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			medicalFacilitiesAppliInfoModelImpl);
	}

	/**
	 * Creates a new medical facilities appli info with the primary key. Does not add the medical facilities appli info to the database.
	 *
	 * @param medicalFacilitiesAppliId the primary key for the new medical facilities appli info
	 * @return the new medical facilities appli info
	 */
	@Override
	public MedicalFacilitiesAppliInfo create(long medicalFacilitiesAppliId) {
		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo =
			new MedicalFacilitiesAppliInfoImpl();

		medicalFacilitiesAppliInfo.setNew(true);
		medicalFacilitiesAppliInfo.setPrimaryKey(medicalFacilitiesAppliId);

		String uuid = PortalUUIDUtil.generate();

		medicalFacilitiesAppliInfo.setUuid(uuid);

		medicalFacilitiesAppliInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return medicalFacilitiesAppliInfo;
	}

	/**
	 * Removes the medical facilities appli info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesAppliId the primary key of the medical facilities appli info
	 * @return the medical facilities appli info that was removed
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a medical facilities appli info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo remove(long medicalFacilitiesAppliId)
		throws NoSuchMedicalFacilitiesAppliInfoException {

		return remove((Serializable)medicalFacilitiesAppliId);
	}

	/**
	 * Removes the medical facilities appli info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the medical facilities appli info
	 * @return the medical facilities appli info that was removed
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a medical facilities appli info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo remove(Serializable primaryKey)
		throws NoSuchMedicalFacilitiesAppliInfoException {

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo =
				(MedicalFacilitiesAppliInfo)session.get(
					MedicalFacilitiesAppliInfoImpl.class, primaryKey);

			if (medicalFacilitiesAppliInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMedicalFacilitiesAppliInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(medicalFacilitiesAppliInfo);
		}
		catch (NoSuchMedicalFacilitiesAppliInfoException
					noSuchEntityException) {

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
	protected MedicalFacilitiesAppliInfo removeImpl(
		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(medicalFacilitiesAppliInfo)) {
				medicalFacilitiesAppliInfo =
					(MedicalFacilitiesAppliInfo)session.get(
						MedicalFacilitiesAppliInfoImpl.class,
						medicalFacilitiesAppliInfo.getPrimaryKeyObj());
			}

			if (medicalFacilitiesAppliInfo != null) {
				session.delete(medicalFacilitiesAppliInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (medicalFacilitiesAppliInfo != null) {
			clearCache(medicalFacilitiesAppliInfo);
		}

		return medicalFacilitiesAppliInfo;
	}

	@Override
	public MedicalFacilitiesAppliInfo updateImpl(
		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo) {

		boolean isNew = medicalFacilitiesAppliInfo.isNew();

		if (!(medicalFacilitiesAppliInfo instanceof
				MedicalFacilitiesAppliInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(medicalFacilitiesAppliInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					medicalFacilitiesAppliInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in medicalFacilitiesAppliInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MedicalFacilitiesAppliInfo implementation " +
					medicalFacilitiesAppliInfo.getClass());
		}

		MedicalFacilitiesAppliInfoModelImpl
			medicalFacilitiesAppliInfoModelImpl =
				(MedicalFacilitiesAppliInfoModelImpl)medicalFacilitiesAppliInfo;

		if (Validator.isNull(medicalFacilitiesAppliInfo.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			medicalFacilitiesAppliInfo.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (medicalFacilitiesAppliInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				medicalFacilitiesAppliInfo.setCreateDate(date);
			}
			else {
				medicalFacilitiesAppliInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!medicalFacilitiesAppliInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				medicalFacilitiesAppliInfo.setModifiedDate(date);
			}
			else {
				medicalFacilitiesAppliInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(medicalFacilitiesAppliInfo);
			}
			else {
				medicalFacilitiesAppliInfo =
					(MedicalFacilitiesAppliInfo)session.merge(
						medicalFacilitiesAppliInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MedicalFacilitiesAppliInfoImpl.class,
			medicalFacilitiesAppliInfoModelImpl, false, true);

		cacheUniqueFindersCache(medicalFacilitiesAppliInfoModelImpl);

		if (isNew) {
			medicalFacilitiesAppliInfo.setNew(false);
		}

		medicalFacilitiesAppliInfo.resetOriginalValues();

		return medicalFacilitiesAppliInfo;
	}

	/**
	 * Returns the medical facilities appli info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the medical facilities appli info
	 * @return the medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a medical facilities appli info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMedicalFacilitiesAppliInfoException {

		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo =
			fetchByPrimaryKey(primaryKey);

		if (medicalFacilitiesAppliInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMedicalFacilitiesAppliInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return medicalFacilitiesAppliInfo;
	}

	/**
	 * Returns the medical facilities appli info with the primary key or throws a <code>NoSuchMedicalFacilitiesAppliInfoException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppliId the primary key of the medical facilities appli info
	 * @return the medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a medical facilities appli info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo findByPrimaryKey(
			long medicalFacilitiesAppliId)
		throws NoSuchMedicalFacilitiesAppliInfoException {

		return findByPrimaryKey((Serializable)medicalFacilitiesAppliId);
	}

	/**
	 * Returns the medical facilities appli info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppliId the primary key of the medical facilities appli info
	 * @return the medical facilities appli info, or <code>null</code> if a medical facilities appli info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesAppliInfo fetchByPrimaryKey(
		long medicalFacilitiesAppliId) {

		return fetchByPrimaryKey((Serializable)medicalFacilitiesAppliId);
	}

	/**
	 * Returns all the medical facilities appli infos.
	 *
	 * @return the medical facilities appli infos
	 */
	@Override
	public List<MedicalFacilitiesAppliInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @return the range of medical facilities appli infos
	 */
	@Override
	public List<MedicalFacilitiesAppliInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities appli infos
	 */
	@Override
	public List<MedicalFacilitiesAppliInfo> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities appli infos
	 */
	@Override
	public List<MedicalFacilitiesAppliInfo> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator,
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

		List<MedicalFacilitiesAppliInfo> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesAppliInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MEDICALFACILITIESAPPLIINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MEDICALFACILITIESAPPLIINFO;

				sql = sql.concat(
					MedicalFacilitiesAppliInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MedicalFacilitiesAppliInfo>)QueryUtil.list(
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
	 * Removes all the medical facilities appli infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo :
				findAll()) {

			remove(medicalFacilitiesAppliInfo);
		}
	}

	/**
	 * Returns the number of medical facilities appli infos.
	 *
	 * @return the number of medical facilities appli infos
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
					_SQL_COUNT_MEDICALFACILITIESAPPLIINFO);

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
		return "medicalFacilitiesAppliId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MEDICALFACILITIESAPPLIINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MedicalFacilitiesAppliInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the medical facilities appli info persistence.
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

		MedicalFacilitiesAppliInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MedicalFacilitiesAppliInfoUtil.setPersistence(null);

		entityCache.removeCache(MedicalFacilitiesAppliInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_MEDICALFACILITIESAPPLIINFO =
		"SELECT medicalFacilitiesAppliInfo FROM MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo";

	private static final String _SQL_SELECT_MEDICALFACILITIESAPPLIINFO_WHERE =
		"SELECT medicalFacilitiesAppliInfo FROM MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo WHERE ";

	private static final String _SQL_COUNT_MEDICALFACILITIESAPPLIINFO =
		"SELECT COUNT(medicalFacilitiesAppliInfo) FROM MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo";

	private static final String _SQL_COUNT_MEDICALFACILITIESAPPLIINFO_WHERE =
		"SELECT COUNT(medicalFacilitiesAppliInfo) FROM MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"medicalFacilitiesAppliInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MedicalFacilitiesAppliInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MedicalFacilitiesAppliInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MedicalFacilitiesAppliInfoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}