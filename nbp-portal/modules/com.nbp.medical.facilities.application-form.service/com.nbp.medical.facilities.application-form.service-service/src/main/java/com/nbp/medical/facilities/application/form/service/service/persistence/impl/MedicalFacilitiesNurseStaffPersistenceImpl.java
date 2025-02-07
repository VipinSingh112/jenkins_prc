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

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFacilitiesNurseStaffException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesNurseStaff;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesNurseStaffTable;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseStaffImpl;
import com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseStaffModelImpl;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesNurseStaffPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesNurseStaffUtil;
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
 * The persistence implementation for the medical facilities nurse staff service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MedicalFacilitiesNurseStaffPersistence.class)
public class MedicalFacilitiesNurseStaffPersistenceImpl
	extends BasePersistenceImpl<MedicalFacilitiesNurseStaff>
	implements MedicalFacilitiesNurseStaffPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MedicalFacilitiesNurseStaffUtil</code> to access the medical facilities nurse staff persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MedicalFacilitiesNurseStaffImpl.class.getName();

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
	 * Returns all the medical facilities nurse staffs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities nurse staffs
	 */
	@Override
	public List<MedicalFacilitiesNurseStaff> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities nurse staffs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @return the range of matching medical facilities nurse staffs
	 */
	@Override
	public List<MedicalFacilitiesNurseStaff> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities nurse staffs
	 */
	@Override
	public List<MedicalFacilitiesNurseStaff> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities nurse staffs
	 */
	@Override
	public List<MedicalFacilitiesNurseStaff> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator,
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

		List<MedicalFacilitiesNurseStaff> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesNurseStaff>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff :
						list) {

					if (!uuid.equals(medicalFacilitiesNurseStaff.getUuid())) {
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

			sb.append(_SQL_SELECT_MEDICALFACILITIESNURSESTAFF_WHERE);

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
				sb.append(MedicalFacilitiesNurseStaffModelImpl.ORDER_BY_JPQL);
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

				list = (List<MedicalFacilitiesNurseStaff>)QueryUtil.list(
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
	 * Returns the first medical facilities nurse staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff findByUuid_First(
			String uuid,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseStaffException {

		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff =
			fetchByUuid_First(uuid, orderByComparator);

		if (medicalFacilitiesNurseStaff != null) {
			return medicalFacilitiesNurseStaff;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesNurseStaffException(sb.toString());
	}

	/**
	 * Returns the first medical facilities nurse staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff fetchByUuid_First(
		String uuid,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		List<MedicalFacilitiesNurseStaff> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities nurse staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff findByUuid_Last(
			String uuid,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseStaffException {

		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff =
			fetchByUuid_Last(uuid, orderByComparator);

		if (medicalFacilitiesNurseStaff != null) {
			return medicalFacilitiesNurseStaff;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesNurseStaffException(sb.toString());
	}

	/**
	 * Returns the last medical facilities nurse staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff fetchByUuid_Last(
		String uuid,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesNurseStaff> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities nurse staffs before and after the current medical facilities nurse staff in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the current medical facilities nurse staff
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a medical facilities nurse staff with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff[] findByUuid_PrevAndNext(
			long medicalFacilitiesNurseStaffId, String uuid,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseStaffException {

		uuid = Objects.toString(uuid, "");

		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff =
			findByPrimaryKey(medicalFacilitiesNurseStaffId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesNurseStaff[] array =
				new MedicalFacilitiesNurseStaffImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, medicalFacilitiesNurseStaff, uuid, orderByComparator,
				true);

			array[1] = medicalFacilitiesNurseStaff;

			array[2] = getByUuid_PrevAndNext(
				session, medicalFacilitiesNurseStaff, uuid, orderByComparator,
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

	protected MedicalFacilitiesNurseStaff getByUuid_PrevAndNext(
		Session session,
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff, String uuid,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALFACILITIESNURSESTAFF_WHERE);

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
			sb.append(MedicalFacilitiesNurseStaffModelImpl.ORDER_BY_JPQL);
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
						medicalFacilitiesNurseStaff)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesNurseStaff> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities nurse staffs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(medicalFacilitiesNurseStaff);
		}
	}

	/**
	 * Returns the number of medical facilities nurse staffs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities nurse staffs
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESNURSESTAFF_WHERE);

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
		"medicalFacilitiesNurseStaff.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(medicalFacilitiesNurseStaff.uuid IS NULL OR medicalFacilitiesNurseStaff.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the medical facilities nurse staff where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesNurseStaffException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesNurseStaffException {

		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff = fetchByUUID_G(
			uuid, groupId);

		if (medicalFacilitiesNurseStaff == null) {
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

			throw new NoSuchMedicalFacilitiesNurseStaffException(sb.toString());
		}

		return medicalFacilitiesNurseStaff;
	}

	/**
	 * Returns the medical facilities nurse staff where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the medical facilities nurse staff where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff fetchByUUID_G(
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

		if (result instanceof MedicalFacilitiesNurseStaff) {
			MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff =
				(MedicalFacilitiesNurseStaff)result;

			if (!Objects.equals(uuid, medicalFacilitiesNurseStaff.getUuid()) ||
				(groupId != medicalFacilitiesNurseStaff.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MEDICALFACILITIESNURSESTAFF_WHERE);

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

				List<MedicalFacilitiesNurseStaff> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff =
						list.get(0);

					result = medicalFacilitiesNurseStaff;

					cacheResult(medicalFacilitiesNurseStaff);
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
			return (MedicalFacilitiesNurseStaff)result;
		}
	}

	/**
	 * Removes the medical facilities nurse staff where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities nurse staff that was removed
	 */
	@Override
	public MedicalFacilitiesNurseStaff removeByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesNurseStaffException {

		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff = findByUUID_G(
			uuid, groupId);

		return remove(medicalFacilitiesNurseStaff);
	}

	/**
	 * Returns the number of medical facilities nurse staffs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities nurse staffs
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALFACILITIESNURSESTAFF_WHERE);

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
		"medicalFacilitiesNurseStaff.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(medicalFacilitiesNurseStaff.uuid IS NULL OR medicalFacilitiesNurseStaff.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"medicalFacilitiesNurseStaff.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the medical facilities nurse staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities nurse staffs
	 */
	@Override
	public List<MedicalFacilitiesNurseStaff> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities nurse staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @return the range of matching medical facilities nurse staffs
	 */
	@Override
	public List<MedicalFacilitiesNurseStaff> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities nurse staffs
	 */
	@Override
	public List<MedicalFacilitiesNurseStaff> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities nurse staffs
	 */
	@Override
	public List<MedicalFacilitiesNurseStaff> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator,
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

		List<MedicalFacilitiesNurseStaff> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesNurseStaff>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff :
						list) {

					if (!uuid.equals(medicalFacilitiesNurseStaff.getUuid()) ||
						(companyId !=
							medicalFacilitiesNurseStaff.getCompanyId())) {

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

			sb.append(_SQL_SELECT_MEDICALFACILITIESNURSESTAFF_WHERE);

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
				sb.append(MedicalFacilitiesNurseStaffModelImpl.ORDER_BY_JPQL);
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

				list = (List<MedicalFacilitiesNurseStaff>)QueryUtil.list(
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
	 * Returns the first medical facilities nurse staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseStaffException {

		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (medicalFacilitiesNurseStaff != null) {
			return medicalFacilitiesNurseStaff;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesNurseStaffException(sb.toString());
	}

	/**
	 * Returns the first medical facilities nurse staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		List<MedicalFacilitiesNurseStaff> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities nurse staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseStaffException {

		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (medicalFacilitiesNurseStaff != null) {
			return medicalFacilitiesNurseStaff;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesNurseStaffException(sb.toString());
	}

	/**
	 * Returns the last medical facilities nurse staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesNurseStaff> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities nurse staffs before and after the current medical facilities nurse staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the current medical facilities nurse staff
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a medical facilities nurse staff with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesNurseStaffId, String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseStaffException {

		uuid = Objects.toString(uuid, "");

		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff =
			findByPrimaryKey(medicalFacilitiesNurseStaffId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesNurseStaff[] array =
				new MedicalFacilitiesNurseStaffImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, medicalFacilitiesNurseStaff, uuid, companyId,
				orderByComparator, true);

			array[1] = medicalFacilitiesNurseStaff;

			array[2] = getByUuid_C_PrevAndNext(
				session, medicalFacilitiesNurseStaff, uuid, companyId,
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

	protected MedicalFacilitiesNurseStaff getByUuid_C_PrevAndNext(
		Session session,
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff, String uuid,
		long companyId,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALFACILITIESNURSESTAFF_WHERE);

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
			sb.append(MedicalFacilitiesNurseStaffModelImpl.ORDER_BY_JPQL);
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
						medicalFacilitiesNurseStaff)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesNurseStaff> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities nurse staffs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(medicalFacilitiesNurseStaff);
		}
	}

	/**
	 * Returns the number of medical facilities nurse staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities nurse staffs
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEDICALFACILITIESNURSESTAFF_WHERE);

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
		"medicalFacilitiesNurseStaff.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(medicalFacilitiesNurseStaff.uuid IS NULL OR medicalFacilitiesNurseStaff.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"medicalFacilitiesNurseStaff.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMedicalFacilitiesById;
	private FinderPath
		_finderPathWithoutPaginationFindBygetMedicalFacilitiesById;
	private FinderPath _finderPathCountBygetMedicalFacilitiesById;

	/**
	 * Returns all the medical facilities nurse staffs where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities nurse staffs
	 */
	@Override
	public List<MedicalFacilitiesNurseStaff> findBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		return findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities nurse staffs where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @return the range of matching medical facilities nurse staffs
	 */
	@Override
	public List<MedicalFacilitiesNurseStaff> findBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, int start, int end) {

		return findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities nurse staffs
	 */
	@Override
	public List<MedicalFacilitiesNurseStaff> findBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		return findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities nurse staffs
	 */
	@Override
	public List<MedicalFacilitiesNurseStaff> findBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator,
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

		List<MedicalFacilitiesNurseStaff> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesNurseStaff>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff :
						list) {

					if (medicalFacilitiesAppId !=
							medicalFacilitiesNurseStaff.
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

			sb.append(_SQL_SELECT_MEDICALFACILITIESNURSESTAFF_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMEDICALFACILITIESBYID_MEDICALFACILITIESAPPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MedicalFacilitiesNurseStaffModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(medicalFacilitiesAppId);

				list = (List<MedicalFacilitiesNurseStaff>)QueryUtil.list(
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
	 * Returns the first medical facilities nurse staff in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff findBygetMedicalFacilitiesById_First(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseStaffException {

		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff =
			fetchBygetMedicalFacilitiesById_First(
				medicalFacilitiesAppId, orderByComparator);

		if (medicalFacilitiesNurseStaff != null) {
			return medicalFacilitiesNurseStaff;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesNurseStaffException(sb.toString());
	}

	/**
	 * Returns the first medical facilities nurse staff in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff fetchBygetMedicalFacilitiesById_First(
		long medicalFacilitiesAppId,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		List<MedicalFacilitiesNurseStaff> list = findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last medical facilities nurse staff in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff findBygetMedicalFacilitiesById_Last(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseStaffException {

		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff =
			fetchBygetMedicalFacilitiesById_Last(
				medicalFacilitiesAppId, orderByComparator);

		if (medicalFacilitiesNurseStaff != null) {
			return medicalFacilitiesNurseStaff;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);

		sb.append("}");

		throw new NoSuchMedicalFacilitiesNurseStaffException(sb.toString());
	}

	/**
	 * Returns the last medical facilities nurse staff in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff fetchBygetMedicalFacilitiesById_Last(
		long medicalFacilitiesAppId,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		int count = countBygetMedicalFacilitiesById(medicalFacilitiesAppId);

		if (count == 0) {
			return null;
		}

		List<MedicalFacilitiesNurseStaff> list = findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the medical facilities nurse staffs before and after the current medical facilities nurse staff in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the current medical facilities nurse staff
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a medical facilities nurse staff with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff[]
			findBygetMedicalFacilitiesById_PrevAndNext(
				long medicalFacilitiesNurseStaffId, long medicalFacilitiesAppId,
				OrderByComparator<MedicalFacilitiesNurseStaff>
					orderByComparator)
		throws NoSuchMedicalFacilitiesNurseStaffException {

		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff =
			findByPrimaryKey(medicalFacilitiesNurseStaffId);

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesNurseStaff[] array =
				new MedicalFacilitiesNurseStaffImpl[3];

			array[0] = getBygetMedicalFacilitiesById_PrevAndNext(
				session, medicalFacilitiesNurseStaff, medicalFacilitiesAppId,
				orderByComparator, true);

			array[1] = medicalFacilitiesNurseStaff;

			array[2] = getBygetMedicalFacilitiesById_PrevAndNext(
				session, medicalFacilitiesNurseStaff, medicalFacilitiesAppId,
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

	protected MedicalFacilitiesNurseStaff
		getBygetMedicalFacilitiesById_PrevAndNext(
			Session session,
			MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff,
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator,
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

		sb.append(_SQL_SELECT_MEDICALFACILITIESNURSESTAFF_WHERE);

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
			sb.append(MedicalFacilitiesNurseStaffModelImpl.ORDER_BY_JPQL);
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
						medicalFacilitiesNurseStaff)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MedicalFacilitiesNurseStaff> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the medical facilities nurse staffs where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 */
	@Override
	public void removeBygetMedicalFacilitiesById(long medicalFacilitiesAppId) {
		for (MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff :
				findBygetMedicalFacilitiesById(
					medicalFacilitiesAppId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(medicalFacilitiesNurseStaff);
		}
	}

	/**
	 * Returns the number of medical facilities nurse staffs where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities nurse staffs
	 */
	@Override
	public int countBygetMedicalFacilitiesById(long medicalFacilitiesAppId) {
		FinderPath finderPath = _finderPathCountBygetMedicalFacilitiesById;

		Object[] finderArgs = new Object[] {medicalFacilitiesAppId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEDICALFACILITIESNURSESTAFF_WHERE);

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
			"medicalFacilitiesNurseStaff.medicalFacilitiesAppId = ?";

	public MedicalFacilitiesNurseStaffPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(MedicalFacilitiesNurseStaff.class);

		setModelImplClass(MedicalFacilitiesNurseStaffImpl.class);
		setModelPKClass(long.class);

		setTable(MedicalFacilitiesNurseStaffTable.INSTANCE);
	}

	/**
	 * Caches the medical facilities nurse staff in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesNurseStaff the medical facilities nurse staff
	 */
	@Override
	public void cacheResult(
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff) {

		entityCache.putResult(
			MedicalFacilitiesNurseStaffImpl.class,
			medicalFacilitiesNurseStaff.getPrimaryKey(),
			medicalFacilitiesNurseStaff);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				medicalFacilitiesNurseStaff.getUuid(),
				medicalFacilitiesNurseStaff.getGroupId()
			},
			medicalFacilitiesNurseStaff);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the medical facilities nurse staffs in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesNurseStaffs the medical facilities nurse staffs
	 */
	@Override
	public void cacheResult(
		List<MedicalFacilitiesNurseStaff> medicalFacilitiesNurseStaffs) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (medicalFacilitiesNurseStaffs.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff :
				medicalFacilitiesNurseStaffs) {

			if (entityCache.getResult(
					MedicalFacilitiesNurseStaffImpl.class,
					medicalFacilitiesNurseStaff.getPrimaryKey()) == null) {

				cacheResult(medicalFacilitiesNurseStaff);
			}
		}
	}

	/**
	 * Clears the cache for all medical facilities nurse staffs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MedicalFacilitiesNurseStaffImpl.class);

		finderCache.clearCache(MedicalFacilitiesNurseStaffImpl.class);
	}

	/**
	 * Clears the cache for the medical facilities nurse staff.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff) {

		entityCache.removeResult(
			MedicalFacilitiesNurseStaffImpl.class, medicalFacilitiesNurseStaff);
	}

	@Override
	public void clearCache(
		List<MedicalFacilitiesNurseStaff> medicalFacilitiesNurseStaffs) {

		for (MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff :
				medicalFacilitiesNurseStaffs) {

			entityCache.removeResult(
				MedicalFacilitiesNurseStaffImpl.class,
				medicalFacilitiesNurseStaff);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MedicalFacilitiesNurseStaffImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MedicalFacilitiesNurseStaffImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MedicalFacilitiesNurseStaffModelImpl
			medicalFacilitiesNurseStaffModelImpl) {

		Object[] args = new Object[] {
			medicalFacilitiesNurseStaffModelImpl.getUuid(),
			medicalFacilitiesNurseStaffModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			medicalFacilitiesNurseStaffModelImpl);
	}

	/**
	 * Creates a new medical facilities nurse staff with the primary key. Does not add the medical facilities nurse staff to the database.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key for the new medical facilities nurse staff
	 * @return the new medical facilities nurse staff
	 */
	@Override
	public MedicalFacilitiesNurseStaff create(
		long medicalFacilitiesNurseStaffId) {

		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff =
			new MedicalFacilitiesNurseStaffImpl();

		medicalFacilitiesNurseStaff.setNew(true);
		medicalFacilitiesNurseStaff.setPrimaryKey(
			medicalFacilitiesNurseStaffId);

		String uuid = PortalUUIDUtil.generate();

		medicalFacilitiesNurseStaff.setUuid(uuid);

		medicalFacilitiesNurseStaff.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return medicalFacilitiesNurseStaff;
	}

	/**
	 * Removes the medical facilities nurse staff with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the medical facilities nurse staff
	 * @return the medical facilities nurse staff that was removed
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a medical facilities nurse staff with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff remove(
			long medicalFacilitiesNurseStaffId)
		throws NoSuchMedicalFacilitiesNurseStaffException {

		return remove((Serializable)medicalFacilitiesNurseStaffId);
	}

	/**
	 * Removes the medical facilities nurse staff with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the medical facilities nurse staff
	 * @return the medical facilities nurse staff that was removed
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a medical facilities nurse staff with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff remove(Serializable primaryKey)
		throws NoSuchMedicalFacilitiesNurseStaffException {

		Session session = null;

		try {
			session = openSession();

			MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff =
				(MedicalFacilitiesNurseStaff)session.get(
					MedicalFacilitiesNurseStaffImpl.class, primaryKey);

			if (medicalFacilitiesNurseStaff == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMedicalFacilitiesNurseStaffException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(medicalFacilitiesNurseStaff);
		}
		catch (NoSuchMedicalFacilitiesNurseStaffException
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
	protected MedicalFacilitiesNurseStaff removeImpl(
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(medicalFacilitiesNurseStaff)) {
				medicalFacilitiesNurseStaff =
					(MedicalFacilitiesNurseStaff)session.get(
						MedicalFacilitiesNurseStaffImpl.class,
						medicalFacilitiesNurseStaff.getPrimaryKeyObj());
			}

			if (medicalFacilitiesNurseStaff != null) {
				session.delete(medicalFacilitiesNurseStaff);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (medicalFacilitiesNurseStaff != null) {
			clearCache(medicalFacilitiesNurseStaff);
		}

		return medicalFacilitiesNurseStaff;
	}

	@Override
	public MedicalFacilitiesNurseStaff updateImpl(
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff) {

		boolean isNew = medicalFacilitiesNurseStaff.isNew();

		if (!(medicalFacilitiesNurseStaff instanceof
				MedicalFacilitiesNurseStaffModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					medicalFacilitiesNurseStaff.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					medicalFacilitiesNurseStaff);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in medicalFacilitiesNurseStaff proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MedicalFacilitiesNurseStaff implementation " +
					medicalFacilitiesNurseStaff.getClass());
		}

		MedicalFacilitiesNurseStaffModelImpl
			medicalFacilitiesNurseStaffModelImpl =
				(MedicalFacilitiesNurseStaffModelImpl)
					medicalFacilitiesNurseStaff;

		if (Validator.isNull(medicalFacilitiesNurseStaff.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			medicalFacilitiesNurseStaff.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (medicalFacilitiesNurseStaff.getCreateDate() == null)) {
			if (serviceContext == null) {
				medicalFacilitiesNurseStaff.setCreateDate(date);
			}
			else {
				medicalFacilitiesNurseStaff.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!medicalFacilitiesNurseStaffModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				medicalFacilitiesNurseStaff.setModifiedDate(date);
			}
			else {
				medicalFacilitiesNurseStaff.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(medicalFacilitiesNurseStaff);
			}
			else {
				medicalFacilitiesNurseStaff =
					(MedicalFacilitiesNurseStaff)session.merge(
						medicalFacilitiesNurseStaff);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MedicalFacilitiesNurseStaffImpl.class,
			medicalFacilitiesNurseStaffModelImpl, false, true);

		cacheUniqueFindersCache(medicalFacilitiesNurseStaffModelImpl);

		if (isNew) {
			medicalFacilitiesNurseStaff.setNew(false);
		}

		medicalFacilitiesNurseStaff.resetOriginalValues();

		return medicalFacilitiesNurseStaff;
	}

	/**
	 * Returns the medical facilities nurse staff with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the medical facilities nurse staff
	 * @return the medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a medical facilities nurse staff with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMedicalFacilitiesNurseStaffException {

		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff =
			fetchByPrimaryKey(primaryKey);

		if (medicalFacilitiesNurseStaff == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMedicalFacilitiesNurseStaffException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return medicalFacilitiesNurseStaff;
	}

	/**
	 * Returns the medical facilities nurse staff with the primary key or throws a <code>NoSuchMedicalFacilitiesNurseStaffException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the medical facilities nurse staff
	 * @return the medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a medical facilities nurse staff with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff findByPrimaryKey(
			long medicalFacilitiesNurseStaffId)
		throws NoSuchMedicalFacilitiesNurseStaffException {

		return findByPrimaryKey((Serializable)medicalFacilitiesNurseStaffId);
	}

	/**
	 * Returns the medical facilities nurse staff with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the medical facilities nurse staff
	 * @return the medical facilities nurse staff, or <code>null</code> if a medical facilities nurse staff with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff fetchByPrimaryKey(
		long medicalFacilitiesNurseStaffId) {

		return fetchByPrimaryKey((Serializable)medicalFacilitiesNurseStaffId);
	}

	/**
	 * Returns all the medical facilities nurse staffs.
	 *
	 * @return the medical facilities nurse staffs
	 */
	@Override
	public List<MedicalFacilitiesNurseStaff> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the medical facilities nurse staffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @return the range of medical facilities nurse staffs
	 */
	@Override
	public List<MedicalFacilitiesNurseStaff> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities nurse staffs
	 */
	@Override
	public List<MedicalFacilitiesNurseStaff> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities nurse staffs
	 */
	@Override
	public List<MedicalFacilitiesNurseStaff> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator,
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

		List<MedicalFacilitiesNurseStaff> list = null;

		if (useFinderCache) {
			list = (List<MedicalFacilitiesNurseStaff>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MEDICALFACILITIESNURSESTAFF);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MEDICALFACILITIESNURSESTAFF;

				sql = sql.concat(
					MedicalFacilitiesNurseStaffModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MedicalFacilitiesNurseStaff>)QueryUtil.list(
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
	 * Removes all the medical facilities nurse staffs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff :
				findAll()) {

			remove(medicalFacilitiesNurseStaff);
		}
	}

	/**
	 * Returns the number of medical facilities nurse staffs.
	 *
	 * @return the number of medical facilities nurse staffs
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
					_SQL_COUNT_MEDICALFACILITIESNURSESTAFF);

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
		return "medicalFacilitiesNurseStaffId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MEDICALFACILITIESNURSESTAFF;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MedicalFacilitiesNurseStaffModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the medical facilities nurse staff persistence.
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

		MedicalFacilitiesNurseStaffUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MedicalFacilitiesNurseStaffUtil.setPersistence(null);

		entityCache.removeCache(
			MedicalFacilitiesNurseStaffImpl.class.getName());
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

	private static final String _SQL_SELECT_MEDICALFACILITIESNURSESTAFF =
		"SELECT medicalFacilitiesNurseStaff FROM MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff";

	private static final String _SQL_SELECT_MEDICALFACILITIESNURSESTAFF_WHERE =
		"SELECT medicalFacilitiesNurseStaff FROM MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff WHERE ";

	private static final String _SQL_COUNT_MEDICALFACILITIESNURSESTAFF =
		"SELECT COUNT(medicalFacilitiesNurseStaff) FROM MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff";

	private static final String _SQL_COUNT_MEDICALFACILITIESNURSESTAFF_WHERE =
		"SELECT COUNT(medicalFacilitiesNurseStaff) FROM MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"medicalFacilitiesNurseStaff.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MedicalFacilitiesNurseStaff exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MedicalFacilitiesNurseStaff exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MedicalFacilitiesNurseStaffPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}