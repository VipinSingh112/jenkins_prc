/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantDirectorPartnerSponsorInfoException;
import com.nbp.sez.status.application.form.service.model.SezOccupantDirectorPartnerSponsorInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantDirectorPartnerSponsorInfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantDirectorPartnerSponsorInfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantDirectorPartnerSponsorInfoModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantDirectorPartnerSponsorInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantDirectorPartnerSponsorInfoUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the sez occupant director partner sponsor info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezOccupantDirectorPartnerSponsorInfoPersistence.class)
public class SezOccupantDirectorPartnerSponsorInfoPersistenceImpl
	extends BasePersistenceImpl<SezOccupantDirectorPartnerSponsorInfo>
	implements SezOccupantDirectorPartnerSponsorInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezOccupantDirectorPartnerSponsorInfoUtil</code> to access the sez occupant director partner sponsor info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezOccupantDirectorPartnerSponsorInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetSezStatusByAppId;
	private FinderPath _finderPathWithoutPaginationFindBygetSezStatusByAppId;
	private FinderPath _finderPathCountBygetSezStatusByAppId;

	/**
	 * Returns all the sez occupant director partner sponsor infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant director partner sponsor infos
	 */
	@Override
	public List<SezOccupantDirectorPartnerSponsorInfo>
		findBygetSezStatusByAppId(long sezStatusApplicationId) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occupant director partner sponsor infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantDirectorPartnerSponsorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant director partner sponsor infos
	 * @param end the upper bound of the range of sez occupant director partner sponsor infos (not inclusive)
	 * @return the range of matching sez occupant director partner sponsor infos
	 */
	@Override
	public List<SezOccupantDirectorPartnerSponsorInfo>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occupant director partner sponsor infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantDirectorPartnerSponsorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant director partner sponsor infos
	 * @param end the upper bound of the range of sez occupant director partner sponsor infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez occupant director partner sponsor infos
	 */
	@Override
	public List<SezOccupantDirectorPartnerSponsorInfo>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end,
			OrderByComparator<SezOccupantDirectorPartnerSponsorInfo>
				orderByComparator) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occupant director partner sponsor infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantDirectorPartnerSponsorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant director partner sponsor infos
	 * @param end the upper bound of the range of sez occupant director partner sponsor infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez occupant director partner sponsor infos
	 */
	@Override
	public List<SezOccupantDirectorPartnerSponsorInfo>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end,
			OrderByComparator<SezOccupantDirectorPartnerSponsorInfo>
				orderByComparator,
			boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetSezStatusByAppId;
				finderArgs = new Object[] {sezStatusApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetSezStatusByAppId;
			finderArgs = new Object[] {
				sezStatusApplicationId, start, end, orderByComparator
			};
		}

		List<SezOccupantDirectorPartnerSponsorInfo> list = null;

		if (useFinderCache) {
			list =
				(List<SezOccupantDirectorPartnerSponsorInfo>)
					finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezOccupantDirectorPartnerSponsorInfo
						sezOccupantDirectorPartnerSponsorInfo : list) {

					if (sezStatusApplicationId !=
							sezOccupantDirectorPartnerSponsorInfo.
								getSezStatusApplicationId()) {

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

			sb.append(_SQL_SELECT_SEZOCCUPANTDIRECTORPARTNERSPONSORINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					SezOccupantDirectorPartnerSponsorInfoModelImpl.
						ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				list =
					(List<SezOccupantDirectorPartnerSponsorInfo>)QueryUtil.list(
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
	 * Returns the first sez occupant director partner sponsor info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant director partner sponsor info
	 * @throws NoSuchSezOccupantDirectorPartnerSponsorInfoException if a matching sez occupant director partner sponsor info could not be found
	 */
	@Override
	public SezOccupantDirectorPartnerSponsorInfo
			findBygetSezStatusByAppId_First(
				long sezStatusApplicationId,
				OrderByComparator<SezOccupantDirectorPartnerSponsorInfo>
					orderByComparator)
		throws NoSuchSezOccupantDirectorPartnerSponsorInfoException {

		SezOccupantDirectorPartnerSponsorInfo
			sezOccupantDirectorPartnerSponsorInfo =
				fetchBygetSezStatusByAppId_First(
					sezStatusApplicationId, orderByComparator);

		if (sezOccupantDirectorPartnerSponsorInfo != null) {
			return sezOccupantDirectorPartnerSponsorInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezOccupantDirectorPartnerSponsorInfoException(
			sb.toString());
	}

	/**
	 * Returns the first sez occupant director partner sponsor info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant director partner sponsor info, or <code>null</code> if a matching sez occupant director partner sponsor info could not be found
	 */
	@Override
	public SezOccupantDirectorPartnerSponsorInfo
		fetchBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantDirectorPartnerSponsorInfo>
				orderByComparator) {

		List<SezOccupantDirectorPartnerSponsorInfo> list =
			findBygetSezStatusByAppId(
				sezStatusApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez occupant director partner sponsor info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant director partner sponsor info
	 * @throws NoSuchSezOccupantDirectorPartnerSponsorInfoException if a matching sez occupant director partner sponsor info could not be found
	 */
	@Override
	public SezOccupantDirectorPartnerSponsorInfo findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantDirectorPartnerSponsorInfo>
				orderByComparator)
		throws NoSuchSezOccupantDirectorPartnerSponsorInfoException {

		SezOccupantDirectorPartnerSponsorInfo
			sezOccupantDirectorPartnerSponsorInfo =
				fetchBygetSezStatusByAppId_Last(
					sezStatusApplicationId, orderByComparator);

		if (sezOccupantDirectorPartnerSponsorInfo != null) {
			return sezOccupantDirectorPartnerSponsorInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezOccupantDirectorPartnerSponsorInfoException(
			sb.toString());
	}

	/**
	 * Returns the last sez occupant director partner sponsor info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant director partner sponsor info, or <code>null</code> if a matching sez occupant director partner sponsor info could not be found
	 */
	@Override
	public SezOccupantDirectorPartnerSponsorInfo
		fetchBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantDirectorPartnerSponsorInfo>
				orderByComparator) {

		int count = countBygetSezStatusByAppId(sezStatusApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezOccupantDirectorPartnerSponsorInfo> list =
			findBygetSezStatusByAppId(
				sezStatusApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez occupant director partner sponsor infos before and after the current sez occupant director partner sponsor info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezOccDirectSpoId the primary key of the current sez occupant director partner sponsor info
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez occupant director partner sponsor info
	 * @throws NoSuchSezOccupantDirectorPartnerSponsorInfoException if a sez occupant director partner sponsor info with the primary key could not be found
	 */
	@Override
	public SezOccupantDirectorPartnerSponsorInfo[]
			findBygetSezStatusByAppId_PrevAndNext(
				long sezOccDirectSpoId, long sezStatusApplicationId,
				OrderByComparator<SezOccupantDirectorPartnerSponsorInfo>
					orderByComparator)
		throws NoSuchSezOccupantDirectorPartnerSponsorInfoException {

		SezOccupantDirectorPartnerSponsorInfo
			sezOccupantDirectorPartnerSponsorInfo = findByPrimaryKey(
				sezOccDirectSpoId);

		Session session = null;

		try {
			session = openSession();

			SezOccupantDirectorPartnerSponsorInfo[] array =
				new SezOccupantDirectorPartnerSponsorInfoImpl[3];

			array[0] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezOccupantDirectorPartnerSponsorInfo,
				sezStatusApplicationId, orderByComparator, true);

			array[1] = sezOccupantDirectorPartnerSponsorInfo;

			array[2] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezOccupantDirectorPartnerSponsorInfo,
				sezStatusApplicationId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected SezOccupantDirectorPartnerSponsorInfo
		getBygetSezStatusByAppId_PrevAndNext(
			Session session,
			SezOccupantDirectorPartnerSponsorInfo
				sezOccupantDirectorPartnerSponsorInfo,
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantDirectorPartnerSponsorInfo>
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

		sb.append(_SQL_SELECT_SEZOCCUPANTDIRECTORPARTNERSPONSORINFO_WHERE);

		sb.append(_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

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
				SezOccupantDirectorPartnerSponsorInfoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(sezStatusApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						sezOccupantDirectorPartnerSponsorInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezOccupantDirectorPartnerSponsorInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez occupant director partner sponsor infos where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	@Override
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId) {
		for (SezOccupantDirectorPartnerSponsorInfo
				sezOccupantDirectorPartnerSponsorInfo :
					findBygetSezStatusByAppId(
						sezStatusApplicationId, QueryUtil.ALL_POS,
						QueryUtil.ALL_POS, null)) {

			remove(sezOccupantDirectorPartnerSponsorInfo);
		}
	}

	/**
	 * Returns the number of sez occupant director partner sponsor infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant director partner sponsor infos
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZOCCUPANTDIRECTORPARTNERSPONSORINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

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
		_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2 =
			"sezOccupantDirectorPartnerSponsorInfo.sezStatusApplicationId = ?";

	public SezOccupantDirectorPartnerSponsorInfoPersistenceImpl() {
		setModelClass(SezOccupantDirectorPartnerSponsorInfo.class);

		setModelImplClass(SezOccupantDirectorPartnerSponsorInfoImpl.class);
		setModelPKClass(long.class);

		setTable(SezOccupantDirectorPartnerSponsorInfoTable.INSTANCE);
	}

	/**
	 * Caches the sez occupant director partner sponsor info in the entity cache if it is enabled.
	 *
	 * @param sezOccupantDirectorPartnerSponsorInfo the sez occupant director partner sponsor info
	 */
	@Override
	public void cacheResult(
		SezOccupantDirectorPartnerSponsorInfo
			sezOccupantDirectorPartnerSponsorInfo) {

		entityCache.putResult(
			SezOccupantDirectorPartnerSponsorInfoImpl.class,
			sezOccupantDirectorPartnerSponsorInfo.getPrimaryKey(),
			sezOccupantDirectorPartnerSponsorInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez occupant director partner sponsor infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupantDirectorPartnerSponsorInfos the sez occupant director partner sponsor infos
	 */
	@Override
	public void cacheResult(
		List<SezOccupantDirectorPartnerSponsorInfo>
			sezOccupantDirectorPartnerSponsorInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezOccupantDirectorPartnerSponsorInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezOccupantDirectorPartnerSponsorInfo
				sezOccupantDirectorPartnerSponsorInfo :
					sezOccupantDirectorPartnerSponsorInfos) {

			if (entityCache.getResult(
					SezOccupantDirectorPartnerSponsorInfoImpl.class,
					sezOccupantDirectorPartnerSponsorInfo.getPrimaryKey()) ==
						null) {

				cacheResult(sezOccupantDirectorPartnerSponsorInfo);
			}
		}
	}

	/**
	 * Clears the cache for all sez occupant director partner sponsor infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezOccupantDirectorPartnerSponsorInfoImpl.class);

		finderCache.clearCache(SezOccupantDirectorPartnerSponsorInfoImpl.class);
	}

	/**
	 * Clears the cache for the sez occupant director partner sponsor info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezOccupantDirectorPartnerSponsorInfo
			sezOccupantDirectorPartnerSponsorInfo) {

		entityCache.removeResult(
			SezOccupantDirectorPartnerSponsorInfoImpl.class,
			sezOccupantDirectorPartnerSponsorInfo);
	}

	@Override
	public void clearCache(
		List<SezOccupantDirectorPartnerSponsorInfo>
			sezOccupantDirectorPartnerSponsorInfos) {

		for (SezOccupantDirectorPartnerSponsorInfo
				sezOccupantDirectorPartnerSponsorInfo :
					sezOccupantDirectorPartnerSponsorInfos) {

			entityCache.removeResult(
				SezOccupantDirectorPartnerSponsorInfoImpl.class,
				sezOccupantDirectorPartnerSponsorInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezOccupantDirectorPartnerSponsorInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezOccupantDirectorPartnerSponsorInfoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sez occupant director partner sponsor info with the primary key. Does not add the sez occupant director partner sponsor info to the database.
	 *
	 * @param sezOccDirectSpoId the primary key for the new sez occupant director partner sponsor info
	 * @return the new sez occupant director partner sponsor info
	 */
	@Override
	public SezOccupantDirectorPartnerSponsorInfo create(
		long sezOccDirectSpoId) {

		SezOccupantDirectorPartnerSponsorInfo
			sezOccupantDirectorPartnerSponsorInfo =
				new SezOccupantDirectorPartnerSponsorInfoImpl();

		sezOccupantDirectorPartnerSponsorInfo.setNew(true);
		sezOccupantDirectorPartnerSponsorInfo.setPrimaryKey(sezOccDirectSpoId);

		sezOccupantDirectorPartnerSponsorInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezOccupantDirectorPartnerSponsorInfo;
	}

	/**
	 * Removes the sez occupant director partner sponsor info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccDirectSpoId the primary key of the sez occupant director partner sponsor info
	 * @return the sez occupant director partner sponsor info that was removed
	 * @throws NoSuchSezOccupantDirectorPartnerSponsorInfoException if a sez occupant director partner sponsor info with the primary key could not be found
	 */
	@Override
	public SezOccupantDirectorPartnerSponsorInfo remove(long sezOccDirectSpoId)
		throws NoSuchSezOccupantDirectorPartnerSponsorInfoException {

		return remove((Serializable)sezOccDirectSpoId);
	}

	/**
	 * Removes the sez occupant director partner sponsor info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez occupant director partner sponsor info
	 * @return the sez occupant director partner sponsor info that was removed
	 * @throws NoSuchSezOccupantDirectorPartnerSponsorInfoException if a sez occupant director partner sponsor info with the primary key could not be found
	 */
	@Override
	public SezOccupantDirectorPartnerSponsorInfo remove(Serializable primaryKey)
		throws NoSuchSezOccupantDirectorPartnerSponsorInfoException {

		Session session = null;

		try {
			session = openSession();

			SezOccupantDirectorPartnerSponsorInfo
				sezOccupantDirectorPartnerSponsorInfo =
					(SezOccupantDirectorPartnerSponsorInfo)session.get(
						SezOccupantDirectorPartnerSponsorInfoImpl.class,
						primaryKey);

			if (sezOccupantDirectorPartnerSponsorInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezOccupantDirectorPartnerSponsorInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezOccupantDirectorPartnerSponsorInfo);
		}
		catch (NoSuchSezOccupantDirectorPartnerSponsorInfoException
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
	protected SezOccupantDirectorPartnerSponsorInfo removeImpl(
		SezOccupantDirectorPartnerSponsorInfo
			sezOccupantDirectorPartnerSponsorInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezOccupantDirectorPartnerSponsorInfo)) {
				sezOccupantDirectorPartnerSponsorInfo =
					(SezOccupantDirectorPartnerSponsorInfo)session.get(
						SezOccupantDirectorPartnerSponsorInfoImpl.class,
						sezOccupantDirectorPartnerSponsorInfo.
							getPrimaryKeyObj());
			}

			if (sezOccupantDirectorPartnerSponsorInfo != null) {
				session.delete(sezOccupantDirectorPartnerSponsorInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezOccupantDirectorPartnerSponsorInfo != null) {
			clearCache(sezOccupantDirectorPartnerSponsorInfo);
		}

		return sezOccupantDirectorPartnerSponsorInfo;
	}

	@Override
	public SezOccupantDirectorPartnerSponsorInfo updateImpl(
		SezOccupantDirectorPartnerSponsorInfo
			sezOccupantDirectorPartnerSponsorInfo) {

		boolean isNew = sezOccupantDirectorPartnerSponsorInfo.isNew();

		if (!(sezOccupantDirectorPartnerSponsorInfo instanceof
				SezOccupantDirectorPartnerSponsorInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezOccupantDirectorPartnerSponsorInfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezOccupantDirectorPartnerSponsorInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezOccupantDirectorPartnerSponsorInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezOccupantDirectorPartnerSponsorInfo implementation " +
					sezOccupantDirectorPartnerSponsorInfo.getClass());
		}

		SezOccupantDirectorPartnerSponsorInfoModelImpl
			sezOccupantDirectorPartnerSponsorInfoModelImpl =
				(SezOccupantDirectorPartnerSponsorInfoModelImpl)
					sezOccupantDirectorPartnerSponsorInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(sezOccupantDirectorPartnerSponsorInfo.getCreateDate() == null)) {

			if (serviceContext == null) {
				sezOccupantDirectorPartnerSponsorInfo.setCreateDate(date);
			}
			else {
				sezOccupantDirectorPartnerSponsorInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezOccupantDirectorPartnerSponsorInfoModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				sezOccupantDirectorPartnerSponsorInfo.setModifiedDate(date);
			}
			else {
				sezOccupantDirectorPartnerSponsorInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezOccupantDirectorPartnerSponsorInfo);
			}
			else {
				sezOccupantDirectorPartnerSponsorInfo =
					(SezOccupantDirectorPartnerSponsorInfo)session.merge(
						sezOccupantDirectorPartnerSponsorInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezOccupantDirectorPartnerSponsorInfoImpl.class,
			sezOccupantDirectorPartnerSponsorInfoModelImpl, false, true);

		if (isNew) {
			sezOccupantDirectorPartnerSponsorInfo.setNew(false);
		}

		sezOccupantDirectorPartnerSponsorInfo.resetOriginalValues();

		return sezOccupantDirectorPartnerSponsorInfo;
	}

	/**
	 * Returns the sez occupant director partner sponsor info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez occupant director partner sponsor info
	 * @return the sez occupant director partner sponsor info
	 * @throws NoSuchSezOccupantDirectorPartnerSponsorInfoException if a sez occupant director partner sponsor info with the primary key could not be found
	 */
	@Override
	public SezOccupantDirectorPartnerSponsorInfo findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchSezOccupantDirectorPartnerSponsorInfoException {

		SezOccupantDirectorPartnerSponsorInfo
			sezOccupantDirectorPartnerSponsorInfo = fetchByPrimaryKey(
				primaryKey);

		if (sezOccupantDirectorPartnerSponsorInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezOccupantDirectorPartnerSponsorInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezOccupantDirectorPartnerSponsorInfo;
	}

	/**
	 * Returns the sez occupant director partner sponsor info with the primary key or throws a <code>NoSuchSezOccupantDirectorPartnerSponsorInfoException</code> if it could not be found.
	 *
	 * @param sezOccDirectSpoId the primary key of the sez occupant director partner sponsor info
	 * @return the sez occupant director partner sponsor info
	 * @throws NoSuchSezOccupantDirectorPartnerSponsorInfoException if a sez occupant director partner sponsor info with the primary key could not be found
	 */
	@Override
	public SezOccupantDirectorPartnerSponsorInfo findByPrimaryKey(
			long sezOccDirectSpoId)
		throws NoSuchSezOccupantDirectorPartnerSponsorInfoException {

		return findByPrimaryKey((Serializable)sezOccDirectSpoId);
	}

	/**
	 * Returns the sez occupant director partner sponsor info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccDirectSpoId the primary key of the sez occupant director partner sponsor info
	 * @return the sez occupant director partner sponsor info, or <code>null</code> if a sez occupant director partner sponsor info with the primary key could not be found
	 */
	@Override
	public SezOccupantDirectorPartnerSponsorInfo fetchByPrimaryKey(
		long sezOccDirectSpoId) {

		return fetchByPrimaryKey((Serializable)sezOccDirectSpoId);
	}

	/**
	 * Returns all the sez occupant director partner sponsor infos.
	 *
	 * @return the sez occupant director partner sponsor infos
	 */
	@Override
	public List<SezOccupantDirectorPartnerSponsorInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occupant director partner sponsor infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantDirectorPartnerSponsorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant director partner sponsor infos
	 * @param end the upper bound of the range of sez occupant director partner sponsor infos (not inclusive)
	 * @return the range of sez occupant director partner sponsor infos
	 */
	@Override
	public List<SezOccupantDirectorPartnerSponsorInfo> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occupant director partner sponsor infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantDirectorPartnerSponsorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant director partner sponsor infos
	 * @param end the upper bound of the range of sez occupant director partner sponsor infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant director partner sponsor infos
	 */
	@Override
	public List<SezOccupantDirectorPartnerSponsorInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantDirectorPartnerSponsorInfo>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occupant director partner sponsor infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantDirectorPartnerSponsorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant director partner sponsor infos
	 * @param end the upper bound of the range of sez occupant director partner sponsor infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant director partner sponsor infos
	 */
	@Override
	public List<SezOccupantDirectorPartnerSponsorInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantDirectorPartnerSponsorInfo>
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

		List<SezOccupantDirectorPartnerSponsorInfo> list = null;

		if (useFinderCache) {
			list =
				(List<SezOccupantDirectorPartnerSponsorInfo>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZOCCUPANTDIRECTORPARTNERSPONSORINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZOCCUPANTDIRECTORPARTNERSPONSORINFO;

				sql = sql.concat(
					SezOccupantDirectorPartnerSponsorInfoModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<SezOccupantDirectorPartnerSponsorInfo>)QueryUtil.list(
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
	 * Removes all the sez occupant director partner sponsor infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezOccupantDirectorPartnerSponsorInfo
				sezOccupantDirectorPartnerSponsorInfo : findAll()) {

			remove(sezOccupantDirectorPartnerSponsorInfo);
		}
	}

	/**
	 * Returns the number of sez occupant director partner sponsor infos.
	 *
	 * @return the number of sez occupant director partner sponsor infos
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
					_SQL_COUNT_SEZOCCUPANTDIRECTORPARTNERSPONSORINFO);

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
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "sezOccDirectSpoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZOCCUPANTDIRECTORPARTNERSPONSORINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezOccupantDirectorPartnerSponsorInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez occupant director partner sponsor info persistence.
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

		_finderPathWithPaginationFindBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetSezStatusByAppId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		SezOccupantDirectorPartnerSponsorInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezOccupantDirectorPartnerSponsorInfoUtil.setPersistence(null);

		entityCache.removeCache(
			SezOccupantDirectorPartnerSponsorInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
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
		_SQL_SELECT_SEZOCCUPANTDIRECTORPARTNERSPONSORINFO =
			"SELECT sezOccupantDirectorPartnerSponsorInfo FROM SezOccupantDirectorPartnerSponsorInfo sezOccupantDirectorPartnerSponsorInfo";

	private static final String
		_SQL_SELECT_SEZOCCUPANTDIRECTORPARTNERSPONSORINFO_WHERE =
			"SELECT sezOccupantDirectorPartnerSponsorInfo FROM SezOccupantDirectorPartnerSponsorInfo sezOccupantDirectorPartnerSponsorInfo WHERE ";

	private static final String
		_SQL_COUNT_SEZOCCUPANTDIRECTORPARTNERSPONSORINFO =
			"SELECT COUNT(sezOccupantDirectorPartnerSponsorInfo) FROM SezOccupantDirectorPartnerSponsorInfo sezOccupantDirectorPartnerSponsorInfo";

	private static final String
		_SQL_COUNT_SEZOCCUPANTDIRECTORPARTNERSPONSORINFO_WHERE =
			"SELECT COUNT(sezOccupantDirectorPartnerSponsorInfo) FROM SezOccupantDirectorPartnerSponsorInfo sezOccupantDirectorPartnerSponsorInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezOccupantDirectorPartnerSponsorInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezOccupantDirectorPartnerSponsorInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezOccupantDirectorPartnerSponsorInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezOccupantDirectorPartnerSponsorInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}