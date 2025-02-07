/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence.impl;

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

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesTrusteeIndividualQualificationinfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeIndividualQualificationinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeIndividualQualificationinfoTable;
import com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeIndividualQualificationinfoImpl;
import com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeIndividualQualificationinfoModelImpl;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesTrusteeIndividualQualificationinfoPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesTrusteeIndividualQualificationinfoUtil;
import com.nbp.osi.services.application.form.service.service.persistence.impl.constants.OSI_SERVICESPersistenceConstants;

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
 * The persistence implementation for the osi services trustee individual qualificationinfo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = OsiServicesTrusteeIndividualQualificationinfoPersistence.class
)
public class OsiServicesTrusteeIndividualQualificationinfoPersistenceImpl
	extends BasePersistenceImpl<OsiServicesTrusteeIndividualQualificationinfo>
	implements OsiServicesTrusteeIndividualQualificationinfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiServicesTrusteeIndividualQualificationinfoUtil</code> to access the osi services trustee individual qualificationinfo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiServicesTrusteeIndividualQualificationinfoImpl.class.getName();

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
	 * Returns all the osi services trustee individual qualificationinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services trustee individual qualificationinfos
	 */
	@Override
	public List<OsiServicesTrusteeIndividualQualificationinfo> findByUuid(
		String uuid) {

		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services trustee individual qualificationinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @return the range of matching osi services trustee individual qualificationinfos
	 */
	@Override
	public List<OsiServicesTrusteeIndividualQualificationinfo> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services trustee individual qualificationinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee individual qualificationinfos
	 */
	@Override
	public List<OsiServicesTrusteeIndividualQualificationinfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
			orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services trustee individual qualificationinfos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee individual qualificationinfos
	 */
	@Override
	public List<OsiServicesTrusteeIndividualQualificationinfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
			orderByComparator,
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

		List<OsiServicesTrusteeIndividualQualificationinfo> list = null;

		if (useFinderCache) {
			list =
				(List<OsiServicesTrusteeIndividualQualificationinfo>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiServicesTrusteeIndividualQualificationinfo
						osiServicesTrusteeIndividualQualificationinfo : list) {

					if (!uuid.equals(
							osiServicesTrusteeIndividualQualificationinfo.
								getUuid())) {

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

			sb.append(
				_SQL_SELECT_OSISERVICESTRUSTEEINDIVIDUALQUALIFICATIONINFO_WHERE);

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
				sb.append(
					OsiServicesTrusteeIndividualQualificationinfoModelImpl.
						ORDER_BY_JPQL);
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

				list =
					(List<OsiServicesTrusteeIndividualQualificationinfo>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Returns the first osi services trustee individual qualificationinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a matching osi services trustee individual qualificationinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo findByUuid_First(
			String uuid,
			OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
				orderByComparator)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo = fetchByUuid_First(
				uuid, orderByComparator);

		if (osiServicesTrusteeIndividualQualificationinfo != null) {
			return osiServicesTrusteeIndividualQualificationinfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOsiServicesTrusteeIndividualQualificationinfoException(
			sb.toString());
	}

	/**
	 * Returns the first osi services trustee individual qualificationinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo fetchByUuid_First(
		String uuid,
		OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
			orderByComparator) {

		List<OsiServicesTrusteeIndividualQualificationinfo> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services trustee individual qualificationinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a matching osi services trustee individual qualificationinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo findByUuid_Last(
			String uuid,
			OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
				orderByComparator)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo = fetchByUuid_Last(
				uuid, orderByComparator);

		if (osiServicesTrusteeIndividualQualificationinfo != null) {
			return osiServicesTrusteeIndividualQualificationinfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOsiServicesTrusteeIndividualQualificationinfoException(
			sb.toString());
	}

	/**
	 * Returns the last osi services trustee individual qualificationinfo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo fetchByUuid_Last(
		String uuid,
		OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
			orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<OsiServicesTrusteeIndividualQualificationinfo> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services trustee individual qualificationinfos before and after the current osi services trustee individual qualificationinfo in the ordered set where uuid = &#63;.
	 *
	 * @param osQualificationId the primary key of the current osi services trustee individual qualificationinfo
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo[]
			findByUuid_PrevAndNext(
				long osQualificationId, String uuid,
				OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
					orderByComparator)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		uuid = Objects.toString(uuid, "");

		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo = findByPrimaryKey(
				osQualificationId);

		Session session = null;

		try {
			session = openSession();

			OsiServicesTrusteeIndividualQualificationinfo[] array =
				new OsiServicesTrusteeIndividualQualificationinfoImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, osiServicesTrusteeIndividualQualificationinfo, uuid,
				orderByComparator, true);

			array[1] = osiServicesTrusteeIndividualQualificationinfo;

			array[2] = getByUuid_PrevAndNext(
				session, osiServicesTrusteeIndividualQualificationinfo, uuid,
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

	protected OsiServicesTrusteeIndividualQualificationinfo
		getByUuid_PrevAndNext(
			Session session,
			OsiServicesTrusteeIndividualQualificationinfo
				osiServicesTrusteeIndividualQualificationinfo,
			String uuid,
			OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
				orderByComparator,
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

		sb.append(
			_SQL_SELECT_OSISERVICESTRUSTEEINDIVIDUALQUALIFICATIONINFO_WHERE);

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
			sb.append(
				OsiServicesTrusteeIndividualQualificationinfoModelImpl.
					ORDER_BY_JPQL);
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
						osiServicesTrusteeIndividualQualificationinfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiServicesTrusteeIndividualQualificationinfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services trustee individual qualificationinfos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (OsiServicesTrusteeIndividualQualificationinfo
				osiServicesTrusteeIndividualQualificationinfo :
					findByUuid(
						uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiServicesTrusteeIndividualQualificationinfo);
		}
	}

	/**
	 * Returns the number of osi services trustee individual qualificationinfos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services trustee individual qualificationinfos
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(
				_SQL_COUNT_OSISERVICESTRUSTEEINDIVIDUALQUALIFICATIONINFO_WHERE);

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
		"osiServicesTrusteeIndividualQualificationinfo.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(osiServicesTrusteeIndividualQualificationinfo.uuid IS NULL OR osiServicesTrusteeIndividualQualificationinfo.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the osi services trustee individual qualificationinfo where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesTrusteeIndividualQualificationinfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a matching osi services trustee individual qualificationinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo findByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo = fetchByUUID_G(
				uuid, groupId);

		if (osiServicesTrusteeIndividualQualificationinfo == null) {
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

			throw new NoSuchOsiServicesTrusteeIndividualQualificationinfoException(
				sb.toString());
		}

		return osiServicesTrusteeIndividualQualificationinfo;
	}

	/**
	 * Returns the osi services trustee individual qualificationinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the osi services trustee individual qualificationinfo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo fetchByUUID_G(
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

		if (result instanceof OsiServicesTrusteeIndividualQualificationinfo) {
			OsiServicesTrusteeIndividualQualificationinfo
				osiServicesTrusteeIndividualQualificationinfo =
					(OsiServicesTrusteeIndividualQualificationinfo)result;

			if (!Objects.equals(
					uuid,
					osiServicesTrusteeIndividualQualificationinfo.getUuid()) ||
				(groupId !=
					osiServicesTrusteeIndividualQualificationinfo.
						getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(
				_SQL_SELECT_OSISERVICESTRUSTEEINDIVIDUALQUALIFICATIONINFO_WHERE);

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

				List<OsiServicesTrusteeIndividualQualificationinfo> list =
					query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					OsiServicesTrusteeIndividualQualificationinfo
						osiServicesTrusteeIndividualQualificationinfo =
							list.get(0);

					result = osiServicesTrusteeIndividualQualificationinfo;

					cacheResult(osiServicesTrusteeIndividualQualificationinfo);
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
			return (OsiServicesTrusteeIndividualQualificationinfo)result;
		}
	}

	/**
	 * Removes the osi services trustee individual qualificationinfo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services trustee individual qualificationinfo that was removed
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo = findByUUID_G(
				uuid, groupId);

		return remove(osiServicesTrusteeIndividualQualificationinfo);
	}

	/**
	 * Returns the number of osi services trustee individual qualificationinfos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services trustee individual qualificationinfos
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(
				_SQL_COUNT_OSISERVICESTRUSTEEINDIVIDUALQUALIFICATIONINFO_WHERE);

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
		"osiServicesTrusteeIndividualQualificationinfo.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(osiServicesTrusteeIndividualQualificationinfo.uuid IS NULL OR osiServicesTrusteeIndividualQualificationinfo.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"osiServicesTrusteeIndividualQualificationinfo.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the osi services trustee individual qualificationinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services trustee individual qualificationinfos
	 */
	@Override
	public List<OsiServicesTrusteeIndividualQualificationinfo> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services trustee individual qualificationinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @return the range of matching osi services trustee individual qualificationinfos
	 */
	@Override
	public List<OsiServicesTrusteeIndividualQualificationinfo> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services trustee individual qualificationinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services trustee individual qualificationinfos
	 */
	@Override
	public List<OsiServicesTrusteeIndividualQualificationinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
			orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services trustee individual qualificationinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services trustee individual qualificationinfos
	 */
	@Override
	public List<OsiServicesTrusteeIndividualQualificationinfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
			orderByComparator,
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

		List<OsiServicesTrusteeIndividualQualificationinfo> list = null;

		if (useFinderCache) {
			list =
				(List<OsiServicesTrusteeIndividualQualificationinfo>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiServicesTrusteeIndividualQualificationinfo
						osiServicesTrusteeIndividualQualificationinfo : list) {

					if (!uuid.equals(
							osiServicesTrusteeIndividualQualificationinfo.
								getUuid()) ||
						(companyId !=
							osiServicesTrusteeIndividualQualificationinfo.
								getCompanyId())) {

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

			sb.append(
				_SQL_SELECT_OSISERVICESTRUSTEEINDIVIDUALQUALIFICATIONINFO_WHERE);

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
				sb.append(
					OsiServicesTrusteeIndividualQualificationinfoModelImpl.
						ORDER_BY_JPQL);
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

				list =
					(List<OsiServicesTrusteeIndividualQualificationinfo>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Returns the first osi services trustee individual qualificationinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a matching osi services trustee individual qualificationinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
				orderByComparator)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo = fetchByUuid_C_First(
				uuid, companyId, orderByComparator);

		if (osiServicesTrusteeIndividualQualificationinfo != null) {
			return osiServicesTrusteeIndividualQualificationinfo;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOsiServicesTrusteeIndividualQualificationinfoException(
			sb.toString());
	}

	/**
	 * Returns the first osi services trustee individual qualificationinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
			orderByComparator) {

		List<OsiServicesTrusteeIndividualQualificationinfo> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services trustee individual qualificationinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a matching osi services trustee individual qualificationinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
				orderByComparator)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo = fetchByUuid_C_Last(
				uuid, companyId, orderByComparator);

		if (osiServicesTrusteeIndividualQualificationinfo != null) {
			return osiServicesTrusteeIndividualQualificationinfo;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOsiServicesTrusteeIndividualQualificationinfoException(
			sb.toString());
	}

	/**
	 * Returns the last osi services trustee individual qualificationinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
			orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<OsiServicesTrusteeIndividualQualificationinfo> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services trustee individual qualificationinfos before and after the current osi services trustee individual qualificationinfo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osQualificationId the primary key of the current osi services trustee individual qualificationinfo
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo[]
			findByUuid_C_PrevAndNext(
				long osQualificationId, String uuid, long companyId,
				OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
					orderByComparator)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		uuid = Objects.toString(uuid, "");

		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo = findByPrimaryKey(
				osQualificationId);

		Session session = null;

		try {
			session = openSession();

			OsiServicesTrusteeIndividualQualificationinfo[] array =
				new OsiServicesTrusteeIndividualQualificationinfoImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, osiServicesTrusteeIndividualQualificationinfo, uuid,
				companyId, orderByComparator, true);

			array[1] = osiServicesTrusteeIndividualQualificationinfo;

			array[2] = getByUuid_C_PrevAndNext(
				session, osiServicesTrusteeIndividualQualificationinfo, uuid,
				companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OsiServicesTrusteeIndividualQualificationinfo
		getByUuid_C_PrevAndNext(
			Session session,
			OsiServicesTrusteeIndividualQualificationinfo
				osiServicesTrusteeIndividualQualificationinfo,
			String uuid, long companyId,
			OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
				orderByComparator,
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

		sb.append(
			_SQL_SELECT_OSISERVICESTRUSTEEINDIVIDUALQUALIFICATIONINFO_WHERE);

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
			sb.append(
				OsiServicesTrusteeIndividualQualificationinfoModelImpl.
					ORDER_BY_JPQL);
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
						osiServicesTrusteeIndividualQualificationinfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiServicesTrusteeIndividualQualificationinfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services trustee individual qualificationinfos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (OsiServicesTrusteeIndividualQualificationinfo
				osiServicesTrusteeIndividualQualificationinfo :
					findByUuid_C(
						uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
						null)) {

			remove(osiServicesTrusteeIndividualQualificationinfo);
		}
	}

	/**
	 * Returns the number of osi services trustee individual qualificationinfos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services trustee individual qualificationinfos
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(
				_SQL_COUNT_OSISERVICESTRUSTEEINDIVIDUALQUALIFICATIONINFO_WHERE);

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
		"osiServicesTrusteeIndividualQualificationinfo.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(osiServicesTrusteeIndividualQualificationinfo.uuid IS NULL OR osiServicesTrusteeIndividualQualificationinfo.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"osiServicesTrusteeIndividualQualificationinfo.companyId = ?";

	private FinderPath _finderPathFetchBygetOsiServicesById;
	private FinderPath _finderPathCountBygetOsiServicesById;

	/**
	 * Returns the osi services trustee individual qualificationinfo where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesTrusteeIndividualQualificationinfoException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a matching osi services trustee individual qualificationinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo
			findBygetOsiServicesById(long osiServicesApplicationId)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo =
				fetchBygetOsiServicesById(osiServicesApplicationId);

		if (osiServicesTrusteeIndividualQualificationinfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiServicesApplicationId=");
			sb.append(osiServicesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiServicesTrusteeIndividualQualificationinfoException(
				sb.toString());
		}

		return osiServicesTrusteeIndividualQualificationinfo;
	}

	/**
	 * Returns the osi services trustee individual qualificationinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo
		fetchBygetOsiServicesById(long osiServicesApplicationId) {

		return fetchBygetOsiServicesById(osiServicesApplicationId, true);
	}

	/**
	 * Returns the osi services trustee individual qualificationinfo where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services trustee individual qualificationinfo, or <code>null</code> if a matching osi services trustee individual qualificationinfo could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo
		fetchBygetOsiServicesById(
			long osiServicesApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiServicesApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiServicesById, finderArgs, this);
		}

		if (result instanceof OsiServicesTrusteeIndividualQualificationinfo) {
			OsiServicesTrusteeIndividualQualificationinfo
				osiServicesTrusteeIndividualQualificationinfo =
					(OsiServicesTrusteeIndividualQualificationinfo)result;

			if (osiServicesApplicationId !=
					osiServicesTrusteeIndividualQualificationinfo.
						getOsiServicesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(
				_SQL_SELECT_OSISERVICESTRUSTEEINDIVIDUALQUALIFICATIONINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICESBYID_OSISERVICESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

				List<OsiServicesTrusteeIndividualQualificationinfo> list =
					query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiServicesById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									osiServicesApplicationId
								};
							}

							_log.warn(
								"OsiServicesTrusteeIndividualQualificationinfoPersistenceImpl.fetchBygetOsiServicesById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiServicesTrusteeIndividualQualificationinfo
						osiServicesTrusteeIndividualQualificationinfo =
							list.get(0);

					result = osiServicesTrusteeIndividualQualificationinfo;

					cacheResult(osiServicesTrusteeIndividualQualificationinfo);
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
			return (OsiServicesTrusteeIndividualQualificationinfo)result;
		}
	}

	/**
	 * Removes the osi services trustee individual qualificationinfo where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services trustee individual qualificationinfo that was removed
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo
			removeBygetOsiServicesById(long osiServicesApplicationId)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo =
				findBygetOsiServicesById(osiServicesApplicationId);

		return remove(osiServicesTrusteeIndividualQualificationinfo);
	}

	/**
	 * Returns the number of osi services trustee individual qualificationinfos where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services trustee individual qualificationinfos
	 */
	@Override
	public int countBygetOsiServicesById(long osiServicesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOsiServicesById;

		Object[] finderArgs = new Object[] {osiServicesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(
				_SQL_COUNT_OSISERVICESTRUSTEEINDIVIDUALQUALIFICATIONINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICESBYID_OSISERVICESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

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
		_FINDER_COLUMN_GETOSISERVICESBYID_OSISERVICESAPPLICATIONID_2 =
			"osiServicesTrusteeIndividualQualificationinfo.osiServicesApplicationId = ?";

	public OsiServicesTrusteeIndividualQualificationinfoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(OsiServicesTrusteeIndividualQualificationinfo.class);

		setModelImplClass(
			OsiServicesTrusteeIndividualQualificationinfoImpl.class);
		setModelPKClass(long.class);

		setTable(OsiServicesTrusteeIndividualQualificationinfoTable.INSTANCE);
	}

	/**
	 * Caches the osi services trustee individual qualificationinfo in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeIndividualQualificationinfo the osi services trustee individual qualificationinfo
	 */
	@Override
	public void cacheResult(
		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo) {

		entityCache.putResult(
			OsiServicesTrusteeIndividualQualificationinfoImpl.class,
			osiServicesTrusteeIndividualQualificationinfo.getPrimaryKey(),
			osiServicesTrusteeIndividualQualificationinfo);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				osiServicesTrusteeIndividualQualificationinfo.getUuid(),
				osiServicesTrusteeIndividualQualificationinfo.getGroupId()
			},
			osiServicesTrusteeIndividualQualificationinfo);

		finderCache.putResult(
			_finderPathFetchBygetOsiServicesById,
			new Object[] {
				osiServicesTrusteeIndividualQualificationinfo.
					getOsiServicesApplicationId()
			},
			osiServicesTrusteeIndividualQualificationinfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi services trustee individual qualificationinfos in the entity cache if it is enabled.
	 *
	 * @param osiServicesTrusteeIndividualQualificationinfos the osi services trustee individual qualificationinfos
	 */
	@Override
	public void cacheResult(
		List<OsiServicesTrusteeIndividualQualificationinfo>
			osiServicesTrusteeIndividualQualificationinfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiServicesTrusteeIndividualQualificationinfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiServicesTrusteeIndividualQualificationinfo
				osiServicesTrusteeIndividualQualificationinfo :
					osiServicesTrusteeIndividualQualificationinfos) {

			if (entityCache.getResult(
					OsiServicesTrusteeIndividualQualificationinfoImpl.class,
					osiServicesTrusteeIndividualQualificationinfo.
						getPrimaryKey()) == null) {

				cacheResult(osiServicesTrusteeIndividualQualificationinfo);
			}
		}
	}

	/**
	 * Clears the cache for all osi services trustee individual qualificationinfos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(
			OsiServicesTrusteeIndividualQualificationinfoImpl.class);

		finderCache.clearCache(
			OsiServicesTrusteeIndividualQualificationinfoImpl.class);
	}

	/**
	 * Clears the cache for the osi services trustee individual qualificationinfo.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo) {

		entityCache.removeResult(
			OsiServicesTrusteeIndividualQualificationinfoImpl.class,
			osiServicesTrusteeIndividualQualificationinfo);
	}

	@Override
	public void clearCache(
		List<OsiServicesTrusteeIndividualQualificationinfo>
			osiServicesTrusteeIndividualQualificationinfos) {

		for (OsiServicesTrusteeIndividualQualificationinfo
				osiServicesTrusteeIndividualQualificationinfo :
					osiServicesTrusteeIndividualQualificationinfos) {

			entityCache.removeResult(
				OsiServicesTrusteeIndividualQualificationinfoImpl.class,
				osiServicesTrusteeIndividualQualificationinfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(
			OsiServicesTrusteeIndividualQualificationinfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiServicesTrusteeIndividualQualificationinfoImpl.class,
				primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiServicesTrusteeIndividualQualificationinfoModelImpl
			osiServicesTrusteeIndividualQualificationinfoModelImpl) {

		Object[] args = new Object[] {
			osiServicesTrusteeIndividualQualificationinfoModelImpl.getUuid(),
			osiServicesTrusteeIndividualQualificationinfoModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			osiServicesTrusteeIndividualQualificationinfoModelImpl);

		args = new Object[] {
			osiServicesTrusteeIndividualQualificationinfoModelImpl.
				getOsiServicesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiServicesById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiServicesById, args,
			osiServicesTrusteeIndividualQualificationinfoModelImpl);
	}

	/**
	 * Creates a new osi services trustee individual qualificationinfo with the primary key. Does not add the osi services trustee individual qualificationinfo to the database.
	 *
	 * @param osQualificationId the primary key for the new osi services trustee individual qualificationinfo
	 * @return the new osi services trustee individual qualificationinfo
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo create(
		long osQualificationId) {

		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo =
				new OsiServicesTrusteeIndividualQualificationinfoImpl();

		osiServicesTrusteeIndividualQualificationinfo.setNew(true);
		osiServicesTrusteeIndividualQualificationinfo.setPrimaryKey(
			osQualificationId);

		String uuid = PortalUUIDUtil.generate();

		osiServicesTrusteeIndividualQualificationinfo.setUuid(uuid);

		osiServicesTrusteeIndividualQualificationinfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return osiServicesTrusteeIndividualQualificationinfo;
	}

	/**
	 * Removes the osi services trustee individual qualificationinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osQualificationId the primary key of the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo that was removed
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo remove(
			long osQualificationId)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		return remove((Serializable)osQualificationId);
	}

	/**
	 * Removes the osi services trustee individual qualificationinfo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo that was removed
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo remove(
			Serializable primaryKey)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		Session session = null;

		try {
			session = openSession();

			OsiServicesTrusteeIndividualQualificationinfo
				osiServicesTrusteeIndividualQualificationinfo =
					(OsiServicesTrusteeIndividualQualificationinfo)session.get(
						OsiServicesTrusteeIndividualQualificationinfoImpl.class,
						primaryKey);

			if (osiServicesTrusteeIndividualQualificationinfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiServicesTrusteeIndividualQualificationinfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiServicesTrusteeIndividualQualificationinfo);
		}
		catch (NoSuchOsiServicesTrusteeIndividualQualificationinfoException
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
	protected OsiServicesTrusteeIndividualQualificationinfo removeImpl(
		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(
					osiServicesTrusteeIndividualQualificationinfo)) {

				osiServicesTrusteeIndividualQualificationinfo =
					(OsiServicesTrusteeIndividualQualificationinfo)session.get(
						OsiServicesTrusteeIndividualQualificationinfoImpl.class,
						osiServicesTrusteeIndividualQualificationinfo.
							getPrimaryKeyObj());
			}

			if (osiServicesTrusteeIndividualQualificationinfo != null) {
				session.delete(osiServicesTrusteeIndividualQualificationinfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiServicesTrusteeIndividualQualificationinfo != null) {
			clearCache(osiServicesTrusteeIndividualQualificationinfo);
		}

		return osiServicesTrusteeIndividualQualificationinfo;
	}

	@Override
	public OsiServicesTrusteeIndividualQualificationinfo updateImpl(
		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo) {

		boolean isNew = osiServicesTrusteeIndividualQualificationinfo.isNew();

		if (!(osiServicesTrusteeIndividualQualificationinfo instanceof
				OsiServicesTrusteeIndividualQualificationinfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					osiServicesTrusteeIndividualQualificationinfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					osiServicesTrusteeIndividualQualificationinfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiServicesTrusteeIndividualQualificationinfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiServicesTrusteeIndividualQualificationinfo implementation " +
					osiServicesTrusteeIndividualQualificationinfo.getClass());
		}

		OsiServicesTrusteeIndividualQualificationinfoModelImpl
			osiServicesTrusteeIndividualQualificationinfoModelImpl =
				(OsiServicesTrusteeIndividualQualificationinfoModelImpl)
					osiServicesTrusteeIndividualQualificationinfo;

		if (Validator.isNull(
				osiServicesTrusteeIndividualQualificationinfo.getUuid())) {

			String uuid = PortalUUIDUtil.generate();

			osiServicesTrusteeIndividualQualificationinfo.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(osiServicesTrusteeIndividualQualificationinfo.getCreateDate() ==
				null)) {

			if (serviceContext == null) {
				osiServicesTrusteeIndividualQualificationinfo.setCreateDate(
					date);
			}
			else {
				osiServicesTrusteeIndividualQualificationinfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiServicesTrusteeIndividualQualificationinfoModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				osiServicesTrusteeIndividualQualificationinfo.setModifiedDate(
					date);
			}
			else {
				osiServicesTrusteeIndividualQualificationinfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiServicesTrusteeIndividualQualificationinfo);
			}
			else {
				osiServicesTrusteeIndividualQualificationinfo =
					(OsiServicesTrusteeIndividualQualificationinfo)
						session.merge(
							osiServicesTrusteeIndividualQualificationinfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiServicesTrusteeIndividualQualificationinfoImpl.class,
			osiServicesTrusteeIndividualQualificationinfoModelImpl, false,
			true);

		cacheUniqueFindersCache(
			osiServicesTrusteeIndividualQualificationinfoModelImpl);

		if (isNew) {
			osiServicesTrusteeIndividualQualificationinfo.setNew(false);
		}

		osiServicesTrusteeIndividualQualificationinfo.resetOriginalValues();

		return osiServicesTrusteeIndividualQualificationinfo;
	}

	/**
	 * Returns the osi services trustee individual qualificationinfo with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		OsiServicesTrusteeIndividualQualificationinfo
			osiServicesTrusteeIndividualQualificationinfo = fetchByPrimaryKey(
				primaryKey);

		if (osiServicesTrusteeIndividualQualificationinfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiServicesTrusteeIndividualQualificationinfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiServicesTrusteeIndividualQualificationinfo;
	}

	/**
	 * Returns the osi services trustee individual qualificationinfo with the primary key or throws a <code>NoSuchOsiServicesTrusteeIndividualQualificationinfoException</code> if it could not be found.
	 *
	 * @param osQualificationId the primary key of the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo
	 * @throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo findByPrimaryKey(
			long osQualificationId)
		throws NoSuchOsiServicesTrusteeIndividualQualificationinfoException {

		return findByPrimaryKey((Serializable)osQualificationId);
	}

	/**
	 * Returns the osi services trustee individual qualificationinfo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osQualificationId the primary key of the osi services trustee individual qualificationinfo
	 * @return the osi services trustee individual qualificationinfo, or <code>null</code> if a osi services trustee individual qualificationinfo with the primary key could not be found
	 */
	@Override
	public OsiServicesTrusteeIndividualQualificationinfo fetchByPrimaryKey(
		long osQualificationId) {

		return fetchByPrimaryKey((Serializable)osQualificationId);
	}

	/**
	 * Returns all the osi services trustee individual qualificationinfos.
	 *
	 * @return the osi services trustee individual qualificationinfos
	 */
	@Override
	public List<OsiServicesTrusteeIndividualQualificationinfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services trustee individual qualificationinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @return the range of osi services trustee individual qualificationinfos
	 */
	@Override
	public List<OsiServicesTrusteeIndividualQualificationinfo> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services trustee individual qualificationinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services trustee individual qualificationinfos
	 */
	@Override
	public List<OsiServicesTrusteeIndividualQualificationinfo> findAll(
		int start, int end,
		OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services trustee individual qualificationinfos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesTrusteeIndividualQualificationinfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services trustee individual qualificationinfos
	 * @param end the upper bound of the range of osi services trustee individual qualificationinfos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services trustee individual qualificationinfos
	 */
	@Override
	public List<OsiServicesTrusteeIndividualQualificationinfo> findAll(
		int start, int end,
		OrderByComparator<OsiServicesTrusteeIndividualQualificationinfo>
			orderByComparator,
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

		List<OsiServicesTrusteeIndividualQualificationinfo> list = null;

		if (useFinderCache) {
			list =
				(List<OsiServicesTrusteeIndividualQualificationinfo>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(
					_SQL_SELECT_OSISERVICESTRUSTEEINDIVIDUALQUALIFICATIONINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSISERVICESTRUSTEEINDIVIDUALQUALIFICATIONINFO;

				sql = sql.concat(
					OsiServicesTrusteeIndividualQualificationinfoModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<OsiServicesTrusteeIndividualQualificationinfo>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Removes all the osi services trustee individual qualificationinfos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiServicesTrusteeIndividualQualificationinfo
				osiServicesTrusteeIndividualQualificationinfo : findAll()) {

			remove(osiServicesTrusteeIndividualQualificationinfo);
		}
	}

	/**
	 * Returns the number of osi services trustee individual qualificationinfos.
	 *
	 * @return the number of osi services trustee individual qualificationinfos
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
					_SQL_COUNT_OSISERVICESTRUSTEEINDIVIDUALQUALIFICATIONINFO);

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
		return "osQualificationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSISERVICESTRUSTEEINDIVIDUALQUALIFICATIONINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiServicesTrusteeIndividualQualificationinfoModelImpl.
			TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi services trustee individual qualificationinfo persistence.
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

		_finderPathFetchBygetOsiServicesById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiServicesById",
			new String[] {Long.class.getName()},
			new String[] {"osiServicesApplicationId"}, true);

		_finderPathCountBygetOsiServicesById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOsiServicesById", new String[] {Long.class.getName()},
			new String[] {"osiServicesApplicationId"}, false);

		OsiServicesTrusteeIndividualQualificationinfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiServicesTrusteeIndividualQualificationinfoUtil.setPersistence(null);

		entityCache.removeCache(
			OsiServicesTrusteeIndividualQualificationinfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String
		_SQL_SELECT_OSISERVICESTRUSTEEINDIVIDUALQUALIFICATIONINFO =
			"SELECT osiServicesTrusteeIndividualQualificationinfo FROM OsiServicesTrusteeIndividualQualificationinfo osiServicesTrusteeIndividualQualificationinfo";

	private static final String
		_SQL_SELECT_OSISERVICESTRUSTEEINDIVIDUALQUALIFICATIONINFO_WHERE =
			"SELECT osiServicesTrusteeIndividualQualificationinfo FROM OsiServicesTrusteeIndividualQualificationinfo osiServicesTrusteeIndividualQualificationinfo WHERE ";

	private static final String
		_SQL_COUNT_OSISERVICESTRUSTEEINDIVIDUALQUALIFICATIONINFO =
			"SELECT COUNT(osiServicesTrusteeIndividualQualificationinfo) FROM OsiServicesTrusteeIndividualQualificationinfo osiServicesTrusteeIndividualQualificationinfo";

	private static final String
		_SQL_COUNT_OSISERVICESTRUSTEEINDIVIDUALQUALIFICATIONINFO_WHERE =
			"SELECT COUNT(osiServicesTrusteeIndividualQualificationinfo) FROM OsiServicesTrusteeIndividualQualificationinfo osiServicesTrusteeIndividualQualificationinfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiServicesTrusteeIndividualQualificationinfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiServicesTrusteeIndividualQualificationinfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiServicesTrusteeIndividualQualificationinfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiServicesTrusteeIndividualQualificationinfoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}