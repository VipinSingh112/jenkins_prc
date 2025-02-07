/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence.impl;

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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchAssetsNotUsedAsSecurityException;
import com.nbp.osi.insolvency.application.form.services.model.AssetsNotUsedAsSecurity;
import com.nbp.osi.insolvency.application.form.services.model.AssetsNotUsedAsSecurityTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.AssetsNotUsedAsSecurityImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.AssetsNotUsedAsSecurityModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.AssetsNotUsedAsSecurityPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.AssetsNotUsedAsSecurityUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.impl.constants.OSI_INSOLVENCYPersistenceConstants;

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
 * The persistence implementation for the assets not used as security service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AssetsNotUsedAsSecurityPersistence.class)
public class AssetsNotUsedAsSecurityPersistenceImpl
	extends BasePersistenceImpl<AssetsNotUsedAsSecurity>
	implements AssetsNotUsedAsSecurityPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AssetsNotUsedAsSecurityUtil</code> to access the assets not used as security persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AssetsNotUsedAsSecurityImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetOsiById;
	private FinderPath _finderPathWithoutPaginationFindBygetOsiById;
	private FinderPath _finderPathCountBygetOsiById;

	/**
	 * Returns all the assets not used as securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching assets not used as securities
	 */
	@Override
	public List<AssetsNotUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId) {

		return findBygetOsiById(
			osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assets not used as securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsNotUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of assets not used as securities
	 * @param end the upper bound of the range of assets not used as securities (not inclusive)
	 * @return the range of matching assets not used as securities
	 */
	@Override
	public List<AssetsNotUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return findBygetOsiById(osiInsolvencyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assets not used as securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsNotUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of assets not used as securities
	 * @param end the upper bound of the range of assets not used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assets not used as securities
	 */
	@Override
	public List<AssetsNotUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<AssetsNotUsedAsSecurity> orderByComparator) {

		return findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the assets not used as securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsNotUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of assets not used as securities
	 * @param end the upper bound of the range of assets not used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assets not used as securities
	 */
	@Override
	public List<AssetsNotUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<AssetsNotUsedAsSecurity> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOsiById;
				finderArgs = new Object[] {osiInsolvencyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOsiById;
			finderArgs = new Object[] {
				osiInsolvencyId, start, end, orderByComparator
			};
		}

		List<AssetsNotUsedAsSecurity> list = null;

		if (useFinderCache) {
			list = (List<AssetsNotUsedAsSecurity>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AssetsNotUsedAsSecurity assetsNotUsedAsSecurity : list) {
					if (osiInsolvencyId !=
							assetsNotUsedAsSecurity.getOsiInsolvencyId()) {

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

			sb.append(_SQL_SELECT_ASSETSNOTUSEDASSECURITY_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AssetsNotUsedAsSecurityModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				list = (List<AssetsNotUsedAsSecurity>)QueryUtil.list(
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
	 * Returns the first assets not used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assets not used as security
	 * @throws NoSuchAssetsNotUsedAsSecurityException if a matching assets not used as security could not be found
	 */
	@Override
	public AssetsNotUsedAsSecurity findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<AssetsNotUsedAsSecurity> orderByComparator)
		throws NoSuchAssetsNotUsedAsSecurityException {

		AssetsNotUsedAsSecurity assetsNotUsedAsSecurity =
			fetchBygetOsiById_First(osiInsolvencyId, orderByComparator);

		if (assetsNotUsedAsSecurity != null) {
			return assetsNotUsedAsSecurity;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchAssetsNotUsedAsSecurityException(sb.toString());
	}

	/**
	 * Returns the first assets not used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assets not used as security, or <code>null</code> if a matching assets not used as security could not be found
	 */
	@Override
	public AssetsNotUsedAsSecurity fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<AssetsNotUsedAsSecurity> orderByComparator) {

		List<AssetsNotUsedAsSecurity> list = findBygetOsiById(
			osiInsolvencyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assets not used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assets not used as security
	 * @throws NoSuchAssetsNotUsedAsSecurityException if a matching assets not used as security could not be found
	 */
	@Override
	public AssetsNotUsedAsSecurity findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<AssetsNotUsedAsSecurity> orderByComparator)
		throws NoSuchAssetsNotUsedAsSecurityException {

		AssetsNotUsedAsSecurity assetsNotUsedAsSecurity =
			fetchBygetOsiById_Last(osiInsolvencyId, orderByComparator);

		if (assetsNotUsedAsSecurity != null) {
			return assetsNotUsedAsSecurity;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchAssetsNotUsedAsSecurityException(sb.toString());
	}

	/**
	 * Returns the last assets not used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assets not used as security, or <code>null</code> if a matching assets not used as security could not be found
	 */
	@Override
	public AssetsNotUsedAsSecurity fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<AssetsNotUsedAsSecurity> orderByComparator) {

		int count = countBygetOsiById(osiInsolvencyId);

		if (count == 0) {
			return null;
		}

		List<AssetsNotUsedAsSecurity> list = findBygetOsiById(
			osiInsolvencyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assets not used as securities before and after the current assets not used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param assetsNotUsedAsSecurityId the primary key of the current assets not used as security
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assets not used as security
	 * @throws NoSuchAssetsNotUsedAsSecurityException if a assets not used as security with the primary key could not be found
	 */
	@Override
	public AssetsNotUsedAsSecurity[] findBygetOsiById_PrevAndNext(
			long assetsNotUsedAsSecurityId, long osiInsolvencyId,
			OrderByComparator<AssetsNotUsedAsSecurity> orderByComparator)
		throws NoSuchAssetsNotUsedAsSecurityException {

		AssetsNotUsedAsSecurity assetsNotUsedAsSecurity = findByPrimaryKey(
			assetsNotUsedAsSecurityId);

		Session session = null;

		try {
			session = openSession();

			AssetsNotUsedAsSecurity[] array =
				new AssetsNotUsedAsSecurityImpl[3];

			array[0] = getBygetOsiById_PrevAndNext(
				session, assetsNotUsedAsSecurity, osiInsolvencyId,
				orderByComparator, true);

			array[1] = assetsNotUsedAsSecurity;

			array[2] = getBygetOsiById_PrevAndNext(
				session, assetsNotUsedAsSecurity, osiInsolvencyId,
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

	protected AssetsNotUsedAsSecurity getBygetOsiById_PrevAndNext(
		Session session, AssetsNotUsedAsSecurity assetsNotUsedAsSecurity,
		long osiInsolvencyId,
		OrderByComparator<AssetsNotUsedAsSecurity> orderByComparator,
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

		sb.append(_SQL_SELECT_ASSETSNOTUSEDASSECURITY_WHERE);

		sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

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
			sb.append(AssetsNotUsedAsSecurityModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(osiInsolvencyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						assetsNotUsedAsSecurity)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AssetsNotUsedAsSecurity> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assets not used as securities where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	@Override
	public void removeBygetOsiById(long osiInsolvencyId) {
		for (AssetsNotUsedAsSecurity assetsNotUsedAsSecurity :
				findBygetOsiById(
					osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(assetsNotUsedAsSecurity);
		}
	}

	/**
	 * Returns the number of assets not used as securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching assets not used as securities
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ASSETSNOTUSEDASSECURITY_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

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

	private static final String _FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2 =
		"assetsNotUsedAsSecurity.osiInsolvencyId = ?";

	public AssetsNotUsedAsSecurityPersistenceImpl() {
		setModelClass(AssetsNotUsedAsSecurity.class);

		setModelImplClass(AssetsNotUsedAsSecurityImpl.class);
		setModelPKClass(long.class);

		setTable(AssetsNotUsedAsSecurityTable.INSTANCE);
	}

	/**
	 * Caches the assets not used as security in the entity cache if it is enabled.
	 *
	 * @param assetsNotUsedAsSecurity the assets not used as security
	 */
	@Override
	public void cacheResult(AssetsNotUsedAsSecurity assetsNotUsedAsSecurity) {
		entityCache.putResult(
			AssetsNotUsedAsSecurityImpl.class,
			assetsNotUsedAsSecurity.getPrimaryKey(), assetsNotUsedAsSecurity);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the assets not used as securities in the entity cache if it is enabled.
	 *
	 * @param assetsNotUsedAsSecurities the assets not used as securities
	 */
	@Override
	public void cacheResult(
		List<AssetsNotUsedAsSecurity> assetsNotUsedAsSecurities) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (assetsNotUsedAsSecurities.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AssetsNotUsedAsSecurity assetsNotUsedAsSecurity :
				assetsNotUsedAsSecurities) {

			if (entityCache.getResult(
					AssetsNotUsedAsSecurityImpl.class,
					assetsNotUsedAsSecurity.getPrimaryKey()) == null) {

				cacheResult(assetsNotUsedAsSecurity);
			}
		}
	}

	/**
	 * Clears the cache for all assets not used as securities.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AssetsNotUsedAsSecurityImpl.class);

		finderCache.clearCache(AssetsNotUsedAsSecurityImpl.class);
	}

	/**
	 * Clears the cache for the assets not used as security.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AssetsNotUsedAsSecurity assetsNotUsedAsSecurity) {
		entityCache.removeResult(
			AssetsNotUsedAsSecurityImpl.class, assetsNotUsedAsSecurity);
	}

	@Override
	public void clearCache(
		List<AssetsNotUsedAsSecurity> assetsNotUsedAsSecurities) {

		for (AssetsNotUsedAsSecurity assetsNotUsedAsSecurity :
				assetsNotUsedAsSecurities) {

			entityCache.removeResult(
				AssetsNotUsedAsSecurityImpl.class, assetsNotUsedAsSecurity);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AssetsNotUsedAsSecurityImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AssetsNotUsedAsSecurityImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new assets not used as security with the primary key. Does not add the assets not used as security to the database.
	 *
	 * @param assetsNotUsedAsSecurityId the primary key for the new assets not used as security
	 * @return the new assets not used as security
	 */
	@Override
	public AssetsNotUsedAsSecurity create(long assetsNotUsedAsSecurityId) {
		AssetsNotUsedAsSecurity assetsNotUsedAsSecurity =
			new AssetsNotUsedAsSecurityImpl();

		assetsNotUsedAsSecurity.setNew(true);
		assetsNotUsedAsSecurity.setPrimaryKey(assetsNotUsedAsSecurityId);

		assetsNotUsedAsSecurity.setCompanyId(CompanyThreadLocal.getCompanyId());

		return assetsNotUsedAsSecurity;
	}

	/**
	 * Removes the assets not used as security with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assetsNotUsedAsSecurityId the primary key of the assets not used as security
	 * @return the assets not used as security that was removed
	 * @throws NoSuchAssetsNotUsedAsSecurityException if a assets not used as security with the primary key could not be found
	 */
	@Override
	public AssetsNotUsedAsSecurity remove(long assetsNotUsedAsSecurityId)
		throws NoSuchAssetsNotUsedAsSecurityException {

		return remove((Serializable)assetsNotUsedAsSecurityId);
	}

	/**
	 * Removes the assets not used as security with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the assets not used as security
	 * @return the assets not used as security that was removed
	 * @throws NoSuchAssetsNotUsedAsSecurityException if a assets not used as security with the primary key could not be found
	 */
	@Override
	public AssetsNotUsedAsSecurity remove(Serializable primaryKey)
		throws NoSuchAssetsNotUsedAsSecurityException {

		Session session = null;

		try {
			session = openSession();

			AssetsNotUsedAsSecurity assetsNotUsedAsSecurity =
				(AssetsNotUsedAsSecurity)session.get(
					AssetsNotUsedAsSecurityImpl.class, primaryKey);

			if (assetsNotUsedAsSecurity == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssetsNotUsedAsSecurityException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(assetsNotUsedAsSecurity);
		}
		catch (NoSuchAssetsNotUsedAsSecurityException noSuchEntityException) {
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
	protected AssetsNotUsedAsSecurity removeImpl(
		AssetsNotUsedAsSecurity assetsNotUsedAsSecurity) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(assetsNotUsedAsSecurity)) {
				assetsNotUsedAsSecurity = (AssetsNotUsedAsSecurity)session.get(
					AssetsNotUsedAsSecurityImpl.class,
					assetsNotUsedAsSecurity.getPrimaryKeyObj());
			}

			if (assetsNotUsedAsSecurity != null) {
				session.delete(assetsNotUsedAsSecurity);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (assetsNotUsedAsSecurity != null) {
			clearCache(assetsNotUsedAsSecurity);
		}

		return assetsNotUsedAsSecurity;
	}

	@Override
	public AssetsNotUsedAsSecurity updateImpl(
		AssetsNotUsedAsSecurity assetsNotUsedAsSecurity) {

		boolean isNew = assetsNotUsedAsSecurity.isNew();

		if (!(assetsNotUsedAsSecurity instanceof
				AssetsNotUsedAsSecurityModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(assetsNotUsedAsSecurity.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					assetsNotUsedAsSecurity);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in assetsNotUsedAsSecurity proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AssetsNotUsedAsSecurity implementation " +
					assetsNotUsedAsSecurity.getClass());
		}

		AssetsNotUsedAsSecurityModelImpl assetsNotUsedAsSecurityModelImpl =
			(AssetsNotUsedAsSecurityModelImpl)assetsNotUsedAsSecurity;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (assetsNotUsedAsSecurity.getCreateDate() == null)) {
			if (serviceContext == null) {
				assetsNotUsedAsSecurity.setCreateDate(date);
			}
			else {
				assetsNotUsedAsSecurity.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!assetsNotUsedAsSecurityModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				assetsNotUsedAsSecurity.setModifiedDate(date);
			}
			else {
				assetsNotUsedAsSecurity.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(assetsNotUsedAsSecurity);
			}
			else {
				assetsNotUsedAsSecurity =
					(AssetsNotUsedAsSecurity)session.merge(
						assetsNotUsedAsSecurity);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AssetsNotUsedAsSecurityImpl.class, assetsNotUsedAsSecurityModelImpl,
			false, true);

		if (isNew) {
			assetsNotUsedAsSecurity.setNew(false);
		}

		assetsNotUsedAsSecurity.resetOriginalValues();

		return assetsNotUsedAsSecurity;
	}

	/**
	 * Returns the assets not used as security with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the assets not used as security
	 * @return the assets not used as security
	 * @throws NoSuchAssetsNotUsedAsSecurityException if a assets not used as security with the primary key could not be found
	 */
	@Override
	public AssetsNotUsedAsSecurity findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAssetsNotUsedAsSecurityException {

		AssetsNotUsedAsSecurity assetsNotUsedAsSecurity = fetchByPrimaryKey(
			primaryKey);

		if (assetsNotUsedAsSecurity == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssetsNotUsedAsSecurityException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return assetsNotUsedAsSecurity;
	}

	/**
	 * Returns the assets not used as security with the primary key or throws a <code>NoSuchAssetsNotUsedAsSecurityException</code> if it could not be found.
	 *
	 * @param assetsNotUsedAsSecurityId the primary key of the assets not used as security
	 * @return the assets not used as security
	 * @throws NoSuchAssetsNotUsedAsSecurityException if a assets not used as security with the primary key could not be found
	 */
	@Override
	public AssetsNotUsedAsSecurity findByPrimaryKey(
			long assetsNotUsedAsSecurityId)
		throws NoSuchAssetsNotUsedAsSecurityException {

		return findByPrimaryKey((Serializable)assetsNotUsedAsSecurityId);
	}

	/**
	 * Returns the assets not used as security with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assetsNotUsedAsSecurityId the primary key of the assets not used as security
	 * @return the assets not used as security, or <code>null</code> if a assets not used as security with the primary key could not be found
	 */
	@Override
	public AssetsNotUsedAsSecurity fetchByPrimaryKey(
		long assetsNotUsedAsSecurityId) {

		return fetchByPrimaryKey((Serializable)assetsNotUsedAsSecurityId);
	}

	/**
	 * Returns all the assets not used as securities.
	 *
	 * @return the assets not used as securities
	 */
	@Override
	public List<AssetsNotUsedAsSecurity> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assets not used as securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsNotUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets not used as securities
	 * @param end the upper bound of the range of assets not used as securities (not inclusive)
	 * @return the range of assets not used as securities
	 */
	@Override
	public List<AssetsNotUsedAsSecurity> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the assets not used as securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsNotUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets not used as securities
	 * @param end the upper bound of the range of assets not used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assets not used as securities
	 */
	@Override
	public List<AssetsNotUsedAsSecurity> findAll(
		int start, int end,
		OrderByComparator<AssetsNotUsedAsSecurity> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the assets not used as securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsNotUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets not used as securities
	 * @param end the upper bound of the range of assets not used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of assets not used as securities
	 */
	@Override
	public List<AssetsNotUsedAsSecurity> findAll(
		int start, int end,
		OrderByComparator<AssetsNotUsedAsSecurity> orderByComparator,
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

		List<AssetsNotUsedAsSecurity> list = null;

		if (useFinderCache) {
			list = (List<AssetsNotUsedAsSecurity>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ASSETSNOTUSEDASSECURITY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ASSETSNOTUSEDASSECURITY;

				sql = sql.concat(
					AssetsNotUsedAsSecurityModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AssetsNotUsedAsSecurity>)QueryUtil.list(
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
	 * Removes all the assets not used as securities from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AssetsNotUsedAsSecurity assetsNotUsedAsSecurity : findAll()) {
			remove(assetsNotUsedAsSecurity);
		}
	}

	/**
	 * Returns the number of assets not used as securities.
	 *
	 * @return the number of assets not used as securities
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
					_SQL_COUNT_ASSETSNOTUSEDASSECURITY);

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
		return "assetsNotUsedAsSecurityId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ASSETSNOTUSEDASSECURITY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AssetsNotUsedAsSecurityModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the assets not used as security persistence.
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

		_finderPathWithPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOsiById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathWithoutPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		AssetsNotUsedAsSecurityUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AssetsNotUsedAsSecurityUtil.setPersistence(null);

		entityCache.removeCache(AssetsNotUsedAsSecurityImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ASSETSNOTUSEDASSECURITY =
		"SELECT assetsNotUsedAsSecurity FROM AssetsNotUsedAsSecurity assetsNotUsedAsSecurity";

	private static final String _SQL_SELECT_ASSETSNOTUSEDASSECURITY_WHERE =
		"SELECT assetsNotUsedAsSecurity FROM AssetsNotUsedAsSecurity assetsNotUsedAsSecurity WHERE ";

	private static final String _SQL_COUNT_ASSETSNOTUSEDASSECURITY =
		"SELECT COUNT(assetsNotUsedAsSecurity) FROM AssetsNotUsedAsSecurity assetsNotUsedAsSecurity";

	private static final String _SQL_COUNT_ASSETSNOTUSEDASSECURITY_WHERE =
		"SELECT COUNT(assetsNotUsedAsSecurity) FROM AssetsNotUsedAsSecurity assetsNotUsedAsSecurity WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"assetsNotUsedAsSecurity.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AssetsNotUsedAsSecurity exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AssetsNotUsedAsSecurity exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AssetsNotUsedAsSecurityPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}